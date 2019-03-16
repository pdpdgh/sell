package com.wanwujinhua.sell.controller;

import com.wanwujinhua.sell.VO.ResultVO;
import com.wanwujinhua.sell.converter.OrderForm2OrderDTOConverter;
import com.wanwujinhua.sell.dto.OrderDTO;
import com.wanwujinhua.sell.enums.ResultEnum;
import com.wanwujinhua.sell.exception.SellException;
import com.wanwujinhua.sell.form.OrderForm;
import com.wanwujinhua.sell.service.OrderService;
import com.wanwujinhua.sell.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @desc ：买家订单controller
 * @auth ：pdp
 * @date ：Created in 2019/3/16 17:03
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;

    /** 创建订单 */
    @PostMapping("/create")
    public ResultVO<Map<String, String>> create(
            @Valid OrderForm orderForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】 参数不正确，orderForm={}", orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }

        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】 购物车不能为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }

        OrderDTO createResult = orderService.create(orderDTO);

        Map<String, String> map = new HashMap<>();
        map.put("orderId", createResult.getOrderId());

        return ResultVOUtil.success(map);
    }
}

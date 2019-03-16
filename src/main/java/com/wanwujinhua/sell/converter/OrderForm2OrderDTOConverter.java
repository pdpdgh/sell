package com.wanwujinhua.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wanwujinhua.sell.dataobject.OrderDetail;
import com.wanwujinhua.sell.dto.OrderDTO;
import com.wanwujinhua.sell.enums.ResultEnum;
import com.wanwujinhua.sell.exception.SellException;
import com.wanwujinhua.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc ：OrderForm2OrderDTOConverter
 * @auth ：pdp
 * @date ：Created in 2019/3/16 17:00
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){}.getType());
        } catch (Exception e) {
            log.error("【对象转换】 错误，string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}

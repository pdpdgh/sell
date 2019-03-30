package com.wanwujinhua.sell.handler;

import com.wanwujinhua.sell.VO.ResultVO;
import com.wanwujinhua.sell.config.ProjectUrlConfig;
import com.wanwujinhua.sell.exception.ResponseBankException;
import com.wanwujinhua.sell.exception.SellException;
import com.wanwujinhua.sell.exception.SellerAuthorizeException;
import com.wanwujinhua.sell.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @desc ：SellExceptionHandler
 * @auth ：pdp
 * @date ：Created in 2019/3/30 10:18
 */
@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    /** 拦截登录异常 */
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
        .concat(projectUrlConfig.getWechatOpenAuthorize())
        .concat("/sell/wechat/qrAuthorize")
        .concat("?returnUrl=")
        .concat(projectUrlConfig.getSell())
        .concat("/sell/seller/login"));
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handleResponseBankException() {

    }
}

package com.wanwujinhua.sell.utils;

import com.wanwujinhua.sell.VO.ResultVO;

/**
 * @desc ：ResultVOUtil
 * @auth ：pdp
 * @date ：Created in 2019/3/15 2:16
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}

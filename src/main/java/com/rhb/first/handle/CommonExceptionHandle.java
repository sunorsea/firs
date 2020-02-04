package com.rhb.first.handle;

import com.rhb.first.pojo.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rhb
 * @Date 2020/2/4
 */
@ControllerAdvice
public class CommonExceptionHandle {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handleException(Exception e){
//        return new ResultBean("500",e.getMessage());
        return new ResultBean("500","当前服务器繁忙,请稍后再试");
    }
}

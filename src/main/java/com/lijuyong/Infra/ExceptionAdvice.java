package com.lijuyong.Infra;

import com.lijuyong.Domain.Model.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by john on 2017/2/10.
 */
@ControllerAdvice
public class ExceptionAdvice {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResult processExcption(NativeWebRequest request, Exception e){
        System.out.println(e.getMessage());
        log.error("这个是一个伟大的异常",e);
        return  new JsonResult(400000,e.getMessage());
    }
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public JsonResult processIllegalArgumentException(HttpServletRequest request,IllegalArgumentException e){
        System.out.println(e.getMessage());

        log.error("这个是一个伟大的异常",e);
        return  new JsonResult(400001,e.getMessage());
    }
}

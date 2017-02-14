package com.lijuyong.Infra;

import com.lijuyong.Domain.Model.JsonResult;
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
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResult processExcption(NativeWebRequest request, Exception e){
        System.out.println(e.getMessage());
        return  new JsonResult(400000,e.getMessage());
    }
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public JsonResult processIllegalArgumentException(HttpServletRequest request,IllegalArgumentException e){
        System.out.println(e.getMessage());
        return  new JsonResult(400001,e.getMessage());
    }
}

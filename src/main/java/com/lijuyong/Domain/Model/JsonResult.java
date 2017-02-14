package com.lijuyong.Domain.Model;

/**
 * Created by john on 2017/2/10.
 */
public class JsonResult {
    private int code;
    private String message;
    public int getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }
    public  JsonResult(int code,String message){
        this.code = code;
        this.message =message;
    }

}

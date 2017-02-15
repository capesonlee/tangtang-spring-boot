package com.lijuyong.Controller;

import com.lijuyong.Domain.Model.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by john on 2017/2/15.
 */
@RestController
@RequestMapping("/security")
public class SecurityController {
    @RequestMapping("/openid")
    public JsonResult openIdAuth(){

        return new JsonResult(123,"好啦");
    }

}

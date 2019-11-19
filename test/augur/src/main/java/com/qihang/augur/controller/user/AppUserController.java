package com.qihang.augur.controller.user;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@Api(tags = "用户信息管理")
@Controller
@RequestMapping("//appUser")
public class AppUserController {
    @GetMapping(value = "/hello")
    public  Object hello(){
        return "augur!!!";
    }
}

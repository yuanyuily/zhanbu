package com.qihang.augur.controller.community;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 社区记录表 前端控制器
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@Api(tags = "社区记录管理")
@Controller
@RequestMapping("/community")
public class CommunityController {
    @GetMapping(value = "/hello")
    public  Object hello(){
        return "augur!!!";
    }
}

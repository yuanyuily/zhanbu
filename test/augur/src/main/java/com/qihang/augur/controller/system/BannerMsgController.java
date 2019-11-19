package com.qihang.augur.controller.system;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 广告banner表 前端控制器
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@Api(tags = "广告banner管理")
@Controller
@RequestMapping("/bannerMsg")
public class BannerMsgController {
    @GetMapping(value = "/hello")
    public  Object hello(){
        return "augur!!!";
    }
}

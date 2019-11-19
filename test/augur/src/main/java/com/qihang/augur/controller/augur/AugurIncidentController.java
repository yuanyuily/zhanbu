package com.qihang.augur.controller.augur;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 占卜事件表 前端控制器
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@Api(tags = "占卜事件管理")
@Controller
@RequestMapping("/augurIncident")
public class AugurIncidentController {
    @GetMapping(value = "/hello")
    public  Object hello(){
        return "augur!!!";
    }
}

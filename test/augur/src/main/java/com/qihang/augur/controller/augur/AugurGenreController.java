package com.qihang.augur.controller.augur;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 占卜流派表 前端控制器
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@Api(tags = "占卜流派管理")
@Controller
@RequestMapping("/augurGenre")
public class AugurGenreController {
    @GetMapping(value = "/hello")
    public  Object hello(){
        return "augur!!!";
    }
}

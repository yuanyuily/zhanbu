package com.qihang.augur.controller.system;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.qihang.augur.entity.system.User;
import com.qihang.augur.mapper.system.UserMapper;
import io.swagger.annotations.Api;
import org.apache.ibatis.session.RowBounds;
import org.elasticsearch.common.recycler.Recycler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 后台管理账号表 前端控制器
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@Api(tags = "后台账号管理")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @GetMapping(value = "/hello")
    public  Object hello(){
        return "augur!!!";
    }



    @GetMapping(value = "/insert")
    public void insert(){
        User user=new User();
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
        String nows = dateFormat.format(now);
        user.setAccount("admin");
        user.setName("测试");
        user.setPassword("aaa111");
        user.setActive(1);
        user.setRoleId(1);
        user.setRoleName("测试");
        user.setMobileNo("");
        user.setCreateTime(now);
        user.setUpdateTime(now);
        userMapper.insert(user);
    }

    @GetMapping(value = "/select")
    public ArrayList<Object> selectAllUser() throws Exception{
        ArrayList<Object> userlist = new ArrayList<>();
//        Page<UserMoneyRecord> page = new Page<UserMoneyRecord>(param.getPageIndex(), param.getPageSize());
        EntityWrapper<User> ew =  new EntityWrapper<User>();
//        Integer selectCount = userMapper.selectCount(ew);
//        String s = selectCount.toString();
//        System.out.println(s);
//        userMapper.selectAllUser();
//        IPage<T> selectPage(IPage<T> page, @Param(Constants.WRAPPER) Wrapper<T> queryWrapper);
        List<User> users = userMapper.selectPage(RowBounds.DEFAULT, ew);
        for (User user : users) {
            userlist.add(user);
        }
        System.out.println(userlist);
        return userlist;

    }
}

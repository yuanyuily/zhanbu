package com.qihang.augur.service.system.impl;

import com.qihang.augur.entity.system.User;
import com.qihang.augur.mapper.system.UserMapper;
import com.qihang.augur.service.system.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台管理账号表 服务实现类
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

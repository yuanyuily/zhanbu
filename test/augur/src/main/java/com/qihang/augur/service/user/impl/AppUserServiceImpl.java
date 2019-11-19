package com.qihang.augur.service.user.impl;

import com.qihang.augur.entity.user.AppUser;
import com.qihang.augur.mapper.user.AppUserMapper;
import com.qihang.augur.service.user.IAppUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@Service
public class AppUserServiceImpl extends ServiceImpl<AppUserMapper, AppUser> implements IAppUserService {

}

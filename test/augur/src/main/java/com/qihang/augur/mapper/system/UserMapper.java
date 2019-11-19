package com.qihang.augur.mapper.system;

import com.qihang.augur.entity.system.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 后台管理账号表 Mapper 接口
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
public interface UserMapper extends BaseMapper<User> {


    int createNewUser (User user);

    @Select(" SELECT id, account, name, password, active, role_id, update_time FROM dc_user WHERE 1 = 1 ")
    int selectAllUser();
}

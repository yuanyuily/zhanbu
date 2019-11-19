package com.qihang.augur.entity.user;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@TableName("t_app_user")
public class AppUser extends Model<AppUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId("user_id")
    private Integer userId;

    /**
     * 用户姓名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户性别
     */
    @TableField("user_sex")
    private String userSex;

    /**
     * 用户手机号码
     */
    @TableField("user_phone")
    private Integer userPhone;

    /**
     * 用户微信号
     */
    @TableField("user_wechat")
    private String userWechat;

    /**
     * 用户生日
     */
    @TableField("user_birthday")
    private Date userBirthday;

    /**
     * 用户余额
     */
    @TableField("user_balance")
    private BigDecimal userBalance;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }
    public String getUserWechat() {
        return userWechat;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat;
    }
    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }
    public BigDecimal getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "AppUser{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userSex=" + userSex +
        ", userPhone=" + userPhone +
        ", userWechat=" + userWechat +
        ", userBirthday=" + userBirthday +
        ", userBalance=" + userBalance +
        "}";
    }
}

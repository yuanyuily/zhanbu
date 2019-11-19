package com.qihang.augur.entity.community;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 社区记录表
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@TableName("t_community")
public class Community extends Model<Community> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 提问模块0.塔罗占卜1.健康手相2.星座分析
     */
    @TableField("ask_module")
    private String askModule;

    /**
     * 问题类型：0.恋情1.事业2.财运3.学业4.健康5.其它
     */
    @TableField("problem_types")
    private Integer problemTypes;

    /**
     * 是否公开答案0.公开1.不公开
     */
    @TableField("is_open_the_answer")
    private Integer isOpenTheAnswer;

    /**
     * 选择回答人数0.1人1.3人2.5人
     */
    @TableField("select_answer_number")
    private Integer selectAnswerNumber;

    /**
     * 提现方式 1.支付宝 2.微信3.苹果官方
     */
    @TableField("drawmoney_type")
    private Integer drawmoneyType;

    /**
     * 优惠券 1.5元 2.10元
     */
    @TableField("discount_coupon")
    private Integer discountCoupon;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getAskModule() {
        return askModule;
    }

    public void setAskModule(String askModule) {
        this.askModule = askModule;
    }
    public Integer getProblemTypes() {
        return problemTypes;
    }

    public void setProblemTypes(Integer problemTypes) {
        this.problemTypes = problemTypes;
    }
    public Integer getIsOpenTheAnswer() {
        return isOpenTheAnswer;
    }

    public void setIsOpenTheAnswer(Integer isOpenTheAnswer) {
        this.isOpenTheAnswer = isOpenTheAnswer;
    }
    public Integer getSelectAnswerNumber() {
        return selectAnswerNumber;
    }

    public void setSelectAnswerNumber(Integer selectAnswerNumber) {
        this.selectAnswerNumber = selectAnswerNumber;
    }
    public Integer getDrawmoneyType() {
        return drawmoneyType;
    }

    public void setDrawmoneyType(Integer drawmoneyType) {
        this.drawmoneyType = drawmoneyType;
    }
    public Integer getDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(Integer discountCoupon) {
        this.discountCoupon = discountCoupon;
    }
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Community{" +
        "id=" + id +
        ", askModule=" + askModule +
        ", problemTypes=" + problemTypes +
        ", isOpenTheAnswer=" + isOpenTheAnswer +
        ", selectAnswerNumber=" + selectAnswerNumber +
        ", drawmoneyType=" + drawmoneyType +
        ", discountCoupon=" + discountCoupon +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        "}";
    }
}

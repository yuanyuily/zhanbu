package com.qihang.augur.entity.augur;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 占卜师信息表
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@TableName("t_app_augur")
public class AppAugur extends Model<AppAugur> {

    private static final long serialVersionUID = 1L;

    /**
     * 占卜师id
     */
    @TableId(value = "augur_id", type = IdType.AUTO)
    private Integer augurId;

    /**
     * 占卜师姓名
     */
    @TableField("augur_name")
    private String augurName;

    /**
     * 占卜师评分
     */
    @TableField("augur_grade")
    private String augurGrade;

    /**
     * 占卜师擅长占卜流派
     */
    @TableField("augur_adept_genre")
    private String augurAdeptGenre;

    /**
     * 占卜师擅长事件占卜
     */
    @TableField("augur_adept_incident")
    private String augurAdeptIncident;

    /**
     * 占卜师费用
     */
    @TableField("augur_cost")
    private BigDecimal augurCost;

    /**
     * 占卜师描述
     */
    @TableField("augur_describe")
    private String augurDescribe;

    /**
     * 占卜师咨询人数
     */
    @TableField("consulting_number")
    private Integer consultingNumber;

    public Integer getAugurId() {
        return augurId;
    }

    public void setAugurId(Integer augurId) {
        this.augurId = augurId;
    }
    public String getAugurName() {
        return augurName;
    }

    public void setAugurName(String augurName) {
        this.augurName = augurName;
    }
    public String getAugurGrade() {
        return augurGrade;
    }

    public void setAugurGrade(String augurGrade) {
        this.augurGrade = augurGrade;
    }
    public String getAugurAdeptGenre() {
        return augurAdeptGenre;
    }

    public void setAugurAdeptGenre(String augurAdeptGenre) {
        this.augurAdeptGenre = augurAdeptGenre;
    }
    public String getAugurAdeptIncident() {
        return augurAdeptIncident;
    }

    public void setAugurAdeptIncident(String augurAdeptIncident) {
        this.augurAdeptIncident = augurAdeptIncident;
    }
    public BigDecimal getAugurCost() {
        return augurCost;
    }

    public void setAugurCost(BigDecimal augurCost) {
        this.augurCost = augurCost;
    }
    public String getAugurDescribe() {
        return augurDescribe;
    }

    public void setAugurDescribe(String augurDescribe) {
        this.augurDescribe = augurDescribe;
    }
    public Integer getConsultingNumber() {
        return consultingNumber;
    }

    public void setConsultingNumber(Integer consultingNumber) {
        this.consultingNumber = consultingNumber;
    }

    @Override
    protected Serializable pkVal() {
        return this.augurId;
    }

    @Override
    public String toString() {
        return "AppAugur{" +
        "augurId=" + augurId +
        ", augurName=" + augurName +
        ", augurGrade=" + augurGrade +
        ", augurAdeptGenre=" + augurAdeptGenre +
        ", augurAdeptIncident=" + augurAdeptIncident +
        ", augurCost=" + augurCost +
        ", augurDescribe=" + augurDescribe +
        ", consultingNumber=" + consultingNumber +
        "}";
    }
}

package com.qihang.augur.entity.augur;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 占卜事件表
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@TableName("t_divination_event_table")
public class DivinationEventTable extends Model<DivinationEventTable> {

    private static final long serialVersionUID = 1L;

    /**
     * 事件id
     */
    private Integer id;

    /**
     * 占卜事件名称
     */
    private String name;

    /**
     * 事件开始时间
     */
    private Date createtime;

    /**
     * 时间结束时间
     */
    private Date updatetime;

    /**
     * 占卜事件结果反馈
     */
    @TableField("divination_event_result")
    private String divinationEventResult;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String getDivinationEventResult() {
        return divinationEventResult;
    }

    public void setDivinationEventResult(String divinationEventResult) {
        this.divinationEventResult = divinationEventResult;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DivinationEventTable{" +
        "id=" + id +
        ", name=" + name +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", divinationEventResult=" + divinationEventResult +
        "}";
    }
}

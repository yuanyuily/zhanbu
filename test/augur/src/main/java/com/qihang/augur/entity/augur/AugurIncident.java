package com.qihang.augur.entity.augur;

import com.baomidou.mybatisplus.annotations.TableId;
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
@TableName("t_augur_incident")
public class AugurIncident extends Model<AugurIncident> {

    private static final long serialVersionUID = 1L;

    /**
     * 事件id
     */
    @TableId("incident_id")
    private Integer incidentId;

    /**
     * 事件占卜名
     */
    @TableField("incident_name")
    private String incidentName;

    /**
     * 事件占卜图片
     */
    @TableField("incident_picture")
    private String incidentPicture;

    public Integer getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Integer incidentId) {
        this.incidentId = incidentId;
    }
    public String getIncidentName() {
        return incidentName;
    }

    public void setIncidentName(String incidentName) {
        this.incidentName = incidentName;
    }
    public String getIncidentPicture() {
        return incidentPicture;
    }

    public void setIncidentPicture(String incidentPicture) {
        this.incidentPicture = incidentPicture;
    }

    @Override
    protected Serializable pkVal() {
        return this.incidentId;
    }

    @Override
    public String toString() {
        return "AugurIncident{" +
        "incidentId=" + incidentId +
        ", incidentName=" + incidentName +
        ", incidentPicture=" + incidentPicture +
        "}";
    }
}

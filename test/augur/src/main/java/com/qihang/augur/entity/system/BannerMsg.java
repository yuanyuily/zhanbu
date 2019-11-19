package com.qihang.augur.entity.system;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 广告banner表
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@TableName("t_banner_msg")
public class BannerMsg extends Model<BannerMsg> {

    private static final long serialVersionUID = 1L;

    /**
     * 广告id
     */
    @TableId("banner_id")
    private Integer bannerId;

    /**
     * 广告名称
     */
    @TableField("banner_name")
    private String bannerName;

    /**
     * 广告图片url
     */
    @TableField("banner_url")
    private String bannerUrl;

    public Integer getBannerId() {
        return bannerId;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }
    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }
    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.bannerId;
    }

    @Override
    public String toString() {
        return "BannerMsg{" +
        "bannerId=" + bannerId +
        ", bannerName=" + bannerName +
        ", bannerUrl=" + bannerUrl +
        "}";
    }
}

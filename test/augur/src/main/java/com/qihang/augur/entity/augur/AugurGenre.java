package com.qihang.augur.entity.augur;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 占卜流派表
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@TableName("t_augur_genre")
public class AugurGenre extends Model<AugurGenre> {

    private static final long serialVersionUID = 1L;

    /**
     * 流派id
     */
    @TableId("genre_id")
    private Integer genreId;

    /**
     * 流派名称
     */
    @TableField("genre_name")
    private String genreName;

    /**
     * 流派图片
     */
    @TableField("genre_picture")
    private String genrePicture;

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }
    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
    public String getGenrePicture() {
        return genrePicture;
    }

    public void setGenrePicture(String genrePicture) {
        this.genrePicture = genrePicture;
    }

    @Override
    protected Serializable pkVal() {
        return this.genreId;
    }

    @Override
    public String toString() {
        return "AugurGenre{" +
        "genreId=" + genreId +
        ", genreName=" + genreName +
        ", genrePicture=" + genrePicture +
        "}";
    }
}

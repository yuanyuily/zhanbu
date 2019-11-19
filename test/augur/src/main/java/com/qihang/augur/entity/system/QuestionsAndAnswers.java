package com.qihang.augur.entity.system;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 问答系统表
 * </p>
 *
 * @author qiahng.augur
 * @since 2019-11-01
 */
@TableName("t_questions_and_answers")
public class QuestionsAndAnswers extends Model<QuestionsAndAnswers> {

    private static final long serialVersionUID = 1L;

    /**
     * 问答id
     */
    @TableField("q_id")
    private Integer qId;

    /**
     * 用户提问
     */
    private String questions;

    /**
     * 占卜师解答
     */
    private String answers;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }
    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }
    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    @Override
    protected Serializable pkVal() {
//        return this.id;
        return null;
    }

    @Override
    public String toString() {
        return "QuestionsAndAnswers{" +
        "qId=" + qId +
        ", questions=" + questions +
        ", answers=" + answers +
        "}";
    }
}

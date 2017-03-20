package com.bdyc.question.po;

public class Question {
    private Integer qId;

    private String qTopic;

    private String qOption;

    private String qAnswer;

    private String qImg;

    private String qObligate;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public String getqTopic() {
        return qTopic;
    }

    public void setqTopic(String qTopic) {
        this.qTopic = qTopic == null ? null : qTopic.trim();
    }

    public String getqOption() {
        return qOption;
    }

    public void setqOption(String qOption) {
        this.qOption = qOption == null ? null : qOption.trim();
    }

    public String getqAnswer() {
        return qAnswer;
    }

    public void setqAnswer(String qAnswer) {
        this.qAnswer = qAnswer == null ? null : qAnswer.trim();
    }

    public String getqImg() {
        return qImg;
    }

    public void setqImg(String qImg) {
        this.qImg = qImg == null ? null : qImg.trim();
    }

    public String getqObligate() {
        return qObligate;
    }

    public void setqObligate(String qObligate) {
        this.qObligate = qObligate == null ? null : qObligate.trim();
    }
}
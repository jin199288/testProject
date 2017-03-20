package com.bdyc.question.dao;

import com.bdyc.question.po.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer qId);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer qId);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}
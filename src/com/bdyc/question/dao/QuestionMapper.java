package com.bdyc.question.dao;

import com.bdyc.question.po.Question;

public interface QuestionMapper {
    int deleteByPrimaryKey(Integer Id);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer Id);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}
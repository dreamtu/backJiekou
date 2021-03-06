package com.ssm.dao;

import com.ssm.model.Article;

import java.util.List;

public interface ArticleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    List allTourist();//获取所有景点数据

    Article touristByTitle(String title);//根据景点名称获取景点数据

    List allRoad();//获取所有路线

    List allFood();//获取所有美食数据

    List allTese();//获取所有特色商品数据
}
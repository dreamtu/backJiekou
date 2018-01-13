package com.ssm.service.interfaces;



import com.ssm.model.Article;
import com.ssm.model.Changyou;

import java.util.List;
import java.util.Map;

/**
 * Created by dqq
 * 测试用的service接口
 */
public interface ITestService {
    Map<String, Object> getUserPaging();

    Article getTourist(String id);//根据景点id获取景点数据

    Article touristByTitle(String title);//根据景点名称获取景点数据

    List getAllTourist();//获取所有景点

    List getAllRoad();//获取所有路线

    Article getRoadById(String id);//根据id获取路线数据

    List getChongyouTab(String type); //获取畅游数据

    Changyou getBigmapById(int id);//根据id获取三张大地图

    List getAllFood();//获取所有美食

    List getAllTese();//获取所有特色商品
}

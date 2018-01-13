package com.ssm.service.services;


import com.ssm.dao.ArticleMapper;
import com.ssm.dao.BaseMapper;
import com.ssm.dao.ChangyouMapper;
import com.ssm.model.Article;
import com.ssm.model.Changyou;
import com.ssm.service.interfaces.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * created by dqq
 * 测试用service
 */
@Service
//@Transactional事务处理  propagation事务传播机制  REQUIRED是保证在事务中的代码只有在当前事务中运行，防止创建多个事务
/*@Transactional(propagation = Propagation.REQUIRED)*/
//注解式数据源，用来进行数据源切换
/*@DataSource(name = DataSource.DEFAULT_DATASOURCE)*/
public class TestServiceImpl implements ITestService {
    @Resource
    BaseMapper baseMapper;
    @Resource
    ArticleMapper articleMapper;
    @Resource
    ChangyouMapper changyouMapper;

    @Override
    public Map<String, Object> getUserPaging() {
        /*Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("tableName", " user ");
        paramMap.put("fields", " * ");
        paramMap.put("pageNow", SysConstants.PAGENOW);
        paramMap.put("pageSize", SysConstants.PAGESIZE);
*//*      paramMap.put("wherecase",null);
        paramMap.put("orderField", null);*//*
        paramMap.put("orderFlag", 1);
        this.baseMapper.getPaging(paramMap);
        paramMap.put("pagingList", this.baseMapper.getPaging(paramMap));
        return CommonUtil.removePaingMap(paramMap);*/
        return null;
    }

    //根据景点id获取景点数据
    @Override
    public Article getTourist(String id) {
        Article tourist = articleMapper.selectByPrimaryKey(id);
        return tourist;
    }

    //根据景点名称获取景点数据
    @Override
    public Article touristByTitle(String title){
        Article article = articleMapper.touristByTitle(title);
        return article;
    }

    //获取所有景点数据
    @Override
    public List getAllTourist() {
        return articleMapper.allTourist();
    }

    //获取所有路线
    @Override
    public List getAllRoad() {
        return articleMapper.allRoad();
    }

    //根据id获取路线数据
    @Override
    public Article getRoadById(String id) {
        Article road = articleMapper.selectByPrimaryKey(id);
        return road;
    }

    //获取畅游数据
    @Override
    public List getChongyouTab(String type) {
        return changyouMapper.chongyouTab(type);
    }

    //根据id获取三张大地图
    @Override
    public Changyou getBigmapById(int id) {
        Changyou bigmap = changyouMapper.selectByPrimaryKey(id);
        return bigmap;
    }

    //获取所有美食数据
    @Override
    public List getAllFood() {
        return articleMapper.allFood();
    }

    //获取所有特色商品
    @Override
    public List getAllTese() {
        return articleMapper.allTese();
    }
}

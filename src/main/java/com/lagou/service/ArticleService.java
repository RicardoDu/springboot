package com.lagou.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.mapper.ArticleMapper;
import com.lagou.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    public PageInfo getPage(int pageSize, int pageNum) {
        //默认当前页1
        pageNum = pageNum == 0?1:pageNum;
        //默认每页10
        pageSize = pageSize == 0?10:pageSize;
        PageHelper.startPage(pageNum,pageSize);
        List<Article> articles = articleMapper.selectArticle();
        PageInfo pageInfo = new PageInfo<>(articles, 5);
        return pageInfo;
    }
}

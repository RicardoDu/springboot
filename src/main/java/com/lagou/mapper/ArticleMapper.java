package com.lagou.mapper;

import com.lagou.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    /**
     * 根据id查询对应的文章
     * @return
     */
    List<Article> selectArticle();

}

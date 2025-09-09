package com.easthot.exam.demo.mapper;

import com.easthot.exam.vo.Article;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface ArticleMapper {

    // select * from article
    List<Article> selectAll();

    // select * from article where id = #{id}
    Article selectById(@RequestParam("id") int id);


}

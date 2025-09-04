package com.easthot.exam.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easthot.exam.demo.service.ArticleService;
import com.easthot.exam.vo.Article;

@Controller
public class UserArticleController {
	
	@Autowired
	private ArticleService as;
		
	
	// 게시글 추가하기
	@RequestMapping("/usr/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		
		return as.doAdd(title, body);
		
	}

	
	// 게시글 전체 보기
	@RequestMapping("/usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		
		return as.getArticles();		
		
	}
	
	// 게시글 하나 선택 상세 보기
	@RequestMapping("/usr/article/selectArticle")
	@ResponseBody
	public Article selectArticle(int id) {
		
		return as.selectArticle(id);
	}
	
	
	// 게시글 삭제 하기
	@RequestMapping("/usr/article/doDelete")
	@ResponseBody
	public String doDelete(int id) {
		
		return as.doDelete(id);
	}
	
	
	// 게시글 수정 하기
	@RequestMapping("/usr/article/doModify")
	@ResponseBody
	public String doModify(int id, String title, String body) {
		
		return as.doModify(id, title, body);	
	}
		

}
 
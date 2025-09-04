package com.easthot.exam.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easthot.exam.vo.Article;

@Controller
public class UserArticleController {
	
	private int articlesLastId;
	
	private List<Article> articles;
	
	public UserArticleController() {
		
		articlesLastId = 0;
		articles = new ArrayList<>();
	}
	

	
	
	@RequestMapping("/usr/article/home")
	@ResponseBody
	public String homeArticle() {
		
		return "여긴 article 홈입니다.";
	}
	
	@RequestMapping("/usr/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		
		int id = articlesLastId + 1;
		Article article = new Article(id, title, body);
		
		articles.add(article);
		
		articlesLastId = id;
		
		return article;		
		
	}

	
	@RequestMapping("/usr/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		
		return articles;		
		
	}
	
	@RequestMapping("/usr/article/doDelete")
	@ResponseBody
	public String doDelete(int id) {
	    for (int i = 0; i < articles.size(); i++) {
	        if (articles.get(i).getId() == id) {
	            articles.remove(i);
	            return id + "번 글이 삭제되었습니다.";
	        }
	    }
	    return id + "번 글이 존재하지 않습니다.";
	}
		

}
 
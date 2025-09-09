package com.easthot.exam.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.easthot.exam.vo.Article;

@Component
public class ArticleRepository {
	
	private int articlesLastId;
	
	public ArticleRepository() {
		
		articlesLastId = 0;
		articles = new ArrayList<>();
	}
	
	
	public int getArticlesLastId() {
		return articlesLastId;
	}

	public void setArticlesLastId(int articlesLastId) {
		this.articlesLastId = articlesLastId;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	private List<Article> articles;

	
	
	
}

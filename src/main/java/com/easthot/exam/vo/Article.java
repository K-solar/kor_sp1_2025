package com.easthot.exam.vo;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
	
	private int id;
	private String title;
	private String body;

}

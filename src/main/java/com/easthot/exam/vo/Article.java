package com.easthot.exam.vo;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {
	
	private int id;
    private Date makeDate;
    private Date updateDate;
	private String title;
	private String body;

}

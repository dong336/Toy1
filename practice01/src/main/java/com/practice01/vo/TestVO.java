package com.practice01.vo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("testVO")
public class TestVO {
	private String id;
	private String name;
	private String artist;
	private String release;
	private String type;
	private String typeCode;
	private String genre;
	private String genreCode;
	private String grade;
	private String price;
	private String downloadCount;
	private String listenCount;
}

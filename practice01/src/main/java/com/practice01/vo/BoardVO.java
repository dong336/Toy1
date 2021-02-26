package com.practice01.vo;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component("boardVO")
public class BoardVO {
	private String type;	// 질문, 자유, 자료
	private String title;
	private String writer;
	private Date date;
	private String viewCnt;
}

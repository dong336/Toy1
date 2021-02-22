package com.practice01.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.practice01.vo.TestVO;

@Service 
public class TestService {
	
	public Map<String, Object> testVOMap() throws Exception{
		Map<String, Object> result = new HashMap<>();
		List<TestVO> list = new ArrayList<>();
		
		for(int i = 1; i <= 20; i++) {
			TestVO vo = new TestVO();
			
			vo.setArtist("Artist" + i);
			vo.setDownloadCount("" + i);
			vo.setGenre("Genre" + i);
			vo.setGenreCode("011" + i);
			vo.setGrade("0" + i);
			vo.setId("id" + i);
			vo.setListenCount("11" + i);
			vo.setName("Song" + i);
			vo.setPrice("100$");
			vo.setRelease("2021/02/22");
			vo.setType("type" + i);
			vo.setTypeCode("typeCode" + i);
			
			list.add(vo);
		}
		
		result.put("dataList", list);
		
		return result;
	}
}

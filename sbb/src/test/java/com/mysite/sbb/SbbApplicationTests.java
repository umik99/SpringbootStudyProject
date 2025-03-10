package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionService questionService;
	
	
	@Test
	void testJpa() {
		for(int i=0;i<300;i++) {
			String subject = String.format("Test Data : [%03d]", i+1);
			String content = "nothing";
		
			this.questionService.create(subject,content);
			
		}
		
	}
}

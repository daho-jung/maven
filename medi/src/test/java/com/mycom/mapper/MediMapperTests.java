package com.mycom.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycom.domain.tempvo;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MediMapperTests {

	@Setter(onMethod_ = @Autowired)
	private MediMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(m -> log.info(m));
	}
	@Test
	public void testinsert() {
		tempvo t = new tempvo();
		t.setPid("asdfqwer");
		mapper.insert(t);
	}
}

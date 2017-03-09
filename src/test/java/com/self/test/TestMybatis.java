package com.self.test;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.self.model.TestNo1;
import com.self.service.ITestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml",
		"classpath:spring-hibernate.xml"})
public class TestMybatis {
	@Autowired
	private ITestService testService;
	@Test
	public void test() {
		TestNo1 obj = new TestNo1();
		obj.setId(UUID.randomUUID().toString());
		obj.setName("aaa");
		obj.setAge(18);
		testService.save(obj);
		System.out.println("TEST");
	}
	@Test
	public void testFindAll() {
		List<TestNo1> list = testService.findAll();
		testService.findAll();
		System.out.println(list.size());
	}
}

package com.ys.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ys.mapper.UserMapper;
import com.ys.po.User;

public class UserMapperTest {
	
	private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//µÃµ½springÈÝÆ÷
    }

    @Test
    public void testSelectUserById() throws Exception {
    	UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
    	User user = userMapper.selectUserById(1);
    	System.out.println(user);
    
    }

}

package com.example.demo;

import com.example.demo.controller.DemoController;
import com.example.demo.model.User;
import com.example.demo.repository.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.awt.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private MockMvc mockMvc;

	@Autowired
	private DemoController demoController;

	@Autowired
	private UserMapper userMapper;

	@Before
	public void init() throws Exception{
		mockMvc = MockMvcBuilders.standaloneSetup(demoController).build();
	}
	@Test
	public void contextLoads() throws Exception{
			mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
	}

	@Test
	public void queryUser() {
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.toString());
	}

}

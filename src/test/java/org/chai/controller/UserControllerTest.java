package org.chai.controller;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath*:applicationContext.xml","classpath*:springmvc.xml","classpath*:mybatis-config.xml"})
@ComponentScan(basePackages = "org.chai.controller")
public class UserControllerTest {
	
/*	@Autowired
	private UserController userController;*/

	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }
	
	@Test
	public void testListUserInfo() throws Exception {
		
		/*Assert.assertTrue("user/userInfo" == userController.listUserInfo("xiao",));*/
		MockHttpServletRequestBuilder mockHttpServletRequsetBuilder=MockMvcRequestBuilders.get("/user/listUserInfo");
		mockHttpServletRequsetBuilder.param("username","xiao");
		
		mockMvc.perform(mockHttpServletRequsetBuilder).andDo(print()).andExpect(status().isOk());
	}
	
	
}

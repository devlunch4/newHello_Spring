package hello.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MvcResult;

import newHello.test.config.WebTestConfig;

@ContextConfiguration(locations = { "classpath:/hello/config/application-context.xml" })
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerTest extends WebTestConfig {

	@Test
	public void ViewTest() throws Exception {

		MvcResult mvcResult = mockMvc.perform(get("/hello/view")).andExpect(status().isOk())
				.andExpect(view().name("hello")).andDo(print())
				.andReturn();
	}

}

package newHello.test.config;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@ContextConfiguration(locations = { "classpath:/hello/config/application-context.xml",
		"classpath:/hello/config/root-context.xml" })
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class WebTestConfig {
	@Autowired
	private WebApplicationContext context;

	protected MockMvc mockMvc;

	// 테스트 전 설정
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Ignore
	@Test
	public void dummy() {

	}

}

package hello.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("hello")
@Controller
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("view")
	public String view() {
		logger.debug("INN HelloController view()");
		return "hello";
	}

	// 제이슨으로 hello 출력
	@RequestMapping("jsonView")
	public String jsonView(Model model) {
		logger.debug("INN HelloController jsonView()");
		model.addAttribute("test_str_json", "1234");
		return "jsonView";
	}

}

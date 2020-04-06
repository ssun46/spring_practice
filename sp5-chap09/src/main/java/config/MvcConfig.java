package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import chap09.HelloController;

@Configuration
// 스프링 MVC 설정을 활성화 (스프링 MVC를 사용하는데 필요한 설정 생성)
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer{

	// DispacherServlet의 매핑 경로를 '/'로 주었을 떄, JSP/HTML/CSS 등을 올바르게 처리하기 위한 설정 추가
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	// JSP를 이용해 컨트롤러의 실행 결과를 보여 주기 위한 설정 추가
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
}

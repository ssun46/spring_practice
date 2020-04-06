package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import java.util.List;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import controller.RegisterRequestValidator;
import interceptor.AuthCheckInterceptor;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/main").setViewName("main");
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
		ms.setBasename("message.label");
		ms.setDefaultEncoding("UTF-8");
		return ms;
	}
	
	// grobal validator
	@Override
	public Validator getValidator() {
		return new RegisterRequestValidator();
	}
	
	// interceptor
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authCheckInterceptor()).addPathPatterns("/edit/**");
		//.excludePathPatterns("/edit/help/**");
	}
	
	@Bean
	public AuthCheckInterceptor authCheckInterceptor() {
		return new AuthCheckInterceptor();
	}
	
	// Converter
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		ObjectMapper objectMapper = Jackson2ObjectMapperBuilder
				.json()
				.featuresToDisable(
						SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
				.build();
//		.simpleDataFormat("yyyyMMddHHmmss")	data를 원하는 패턴으로 변환하는 방법 (but, LocalDateTime에는 적용 안됨 / ISO-8601 형식으로 출력됨)
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		ObjectMapper objectMapper = Jackson-------
//		.json()
//		.serializerbyType(LocalDateTime.class, new LocalDateTimeSerializer(formatter))	모든 LocalDateTime 타입에 대해 원하는 패턴 적용
//		.build();
		converters.add(0,
				new MappingJackson2HttpMessageConverter(objectMapper));
		
	}
	
}

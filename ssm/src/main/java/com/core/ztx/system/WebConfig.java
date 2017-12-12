package com.core.ztx.system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@EnableWebMvc
//@ComponentScan(basePackageClasses=ControllerScan.class)
//@Import(SpringConfig.class)
//@ImportResource("classpath:spring/spring.xml")
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public FreeMarkerConfigurer freemarkerConfig(){
		FreeMarkerConfigurer freemarkerConfig = new FreeMarkerConfigurer();
		freemarkerConfig.setTemplateLoaderPath("/resources/views/");
		freemarkerConfig.setDefaultEncoding("UTF-8");
		return freemarkerConfig;
	}
	
	@Bean
	public ViewResolver htmlviewResolver(){
		FreeMarkerViewResolver htmlviewResolver = new FreeMarkerViewResolver();
		htmlviewResolver.setSuffix(".html");
		htmlviewResolver.setContentType("text/html;charset=UTF-8");
		htmlviewResolver.setOrder(0);
		htmlviewResolver.setRequestContextAttribute("request");
		//htmlviewResolver.setExposeSessionAttributes(true);
		return htmlviewResolver;
	}

	@Bean
	public ViewResolver jspViewResolver(){
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setViewClass(JstlView.class);
		irvr.setContentType("text/html;charset=UTF-8");
		irvr.setPrefix("/resources/views/");
		irvr.setSuffix(".jsp");
		irvr.setOrder(0);
		return irvr;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
		configurer.enable();
	}
}

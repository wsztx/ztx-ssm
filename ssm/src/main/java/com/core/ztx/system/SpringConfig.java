package com.core.ztx.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.core.ztx.controller.ControllerScan;
import com.core.ztx.entity.Dictionary;
import com.core.ztx.entity.Member;

@Configuration
public class SpringConfig {
	
	@Autowired
	Environment env;
	
	@Value("${text}")
	private String text;
	@Value("${type}")
	private String type;
	@Value("${value}")
	private String value;

	@Bean
	@Profile("test")
	public Member member(){
		Member m = new Member();
		m.setId(1L);
		m.setUserId(12L);
		m.setMemberType("1");
		return m;
	}
	
	@Bean
	@Profile("test")
	@Conditional(Member2Condition.class)
	public Member member2(){
		Member m = new Member();
		m.setId(2L);
		m.setUserId(12L);
		m.setMemberType("2");
		return m;
	}
	
/*	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Dictionary dictionary(){
		Dictionary dic = new Dictionary();
		dic.setId(1L);
		dic.setSts("1");
		dic.setDicText("男");
		dic.setDicType("sex");
		dic.setDicValue("1");
		return dic;
	}*/
	
/*	@Bean
	public Dictionary dic(){
		Dictionary dic = new Dictionary();
		dic.setId(2L);
		dic.setSts("1");
		dic.setDicText(env.getProperty("text"));
		dic.setDicType(env.getProperty("type"));
		dic.setDicValue(env.getProperty("value"));
		return dic;
	}*/
	
	@Bean
	public Dictionary dic(){
		Dictionary dic = new Dictionary();
		dic.setId(2L);
		dic.setSts("1");
		dic.setDicText(text);
		dic.setDicType(type);
		dic.setDicValue(value);
		return dic;
	}
	

}

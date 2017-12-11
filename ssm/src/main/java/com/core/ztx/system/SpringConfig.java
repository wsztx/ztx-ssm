package com.core.ztx.system;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.core.ztx.entity.Member;

@Configuration
public class SpringConfig {

	@Bean
	@Profile("test")
	public Member member(){
		Member m = new Member();
		m.setUserId(12L);
		m.setMemberType("1");
		return m;
	}
}

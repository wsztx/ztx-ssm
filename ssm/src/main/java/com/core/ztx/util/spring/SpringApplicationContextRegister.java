package com.core.ztx.util.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringApplicationContextRegister implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(SpringApplicationContextRegister.class);

    public SpringApplicationContextRegister() {
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringApplicationContextUtils.setApplicationContext(applicationContext);
        logger.info("Register ApplicationContext");
    }
}

package com.core.ztx.util.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

public class SpringApplicationContextUtils {
    private static final Logger logger = LoggerFactory.getLogger(SpringApplicationContextUtils.class);

    private static ApplicationContext applicationContext;

    public static synchronized void setApplicationContext(ApplicationContext applicationContext) {
        SpringApplicationContextUtils.applicationContext = applicationContext;
        logger.info("ApplicationContext Registered");
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T> requiredType) {
        return applicationContext.getBean(requiredType);
    }

    public static <T> T getBean(String name, Class<T> requiredType) {
        return applicationContext.getBean(name, requiredType);
    }
}

package com.eenet.basequery.local.env;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringEnv {

	private static SpringEnv INSTANCE;
	private static ClassPathXmlApplicationContext context;
	
	public static SpringEnv getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SpringEnv();
		return INSTANCE;
	}
	
	public ApplicationContext getContext() {
		if (SpringEnv.context == null)
			initEnvironment();
		return context;
	}
	
	@BeforeClass
	public static void initEnvironment() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
			"global-config.xml",
			"rdbms-dataSource.xml",
			"redis.xml",
			"transaction.xml",
			"basequery-service.xml"
			
		});
		context.start();
		SpringEnv.context = context;
	}
	
	@AfterClass
	public static void stopServiceConsumer() {
		if (context != null) {
			context.stop();
			context.close();
			context = null;
		}
	}
}

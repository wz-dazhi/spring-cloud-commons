package com.wz.debug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @projectName: spring-cloud-commons
 * @package: com.wz.debug
 * @className: App
 * @description:
 * @author: zhi
 * @date: 2022/4/6
 * @version: 1.0
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(App.class, args);
		ConfigurableEnvironment e = c.getEnvironment();
		System.out.println(e.getProperty("u.name"));
		System.out.println(e.getProperty("u.age"));
	}

}

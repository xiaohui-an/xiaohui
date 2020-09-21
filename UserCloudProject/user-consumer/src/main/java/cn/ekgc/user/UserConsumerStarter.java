package cn.ekgc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <b>用户功能 Consumer 启动器</b>
 * @author xiaohui
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class UserConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(UserConsumerStarter.class, args);
	}
}

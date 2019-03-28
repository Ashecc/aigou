package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: zw
 * @create: 2019-03-26 17:49
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplicationServer7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationServer7001.class);
    }
}

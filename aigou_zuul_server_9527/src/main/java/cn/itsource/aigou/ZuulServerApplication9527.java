package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: zw
 * @create: 2019-03-26 18:04
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServerApplication9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication9527.class);
    }
}

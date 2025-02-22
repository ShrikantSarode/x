package example.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy	//enables proxy generation support.
public class AopSpringConfig {
	//Additional bean configurations using @Bean if any...
}

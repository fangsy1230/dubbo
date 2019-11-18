package org.fsy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;


@ComponentScan(basePackages = {"org.fsy"})
@EnableDubbo
@SpringBootApplication

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("I am dubbo client");
    	SpringApplication.run(App.class, args);
    }
    
    @Bean
    public EmbeddedServletContainerFactory createEmbeddedServletContainerFactory(
            // NO_UCD (unused code)
            @Value("${jetty.server.port:8000}") final int port) {
     
        final JettyEmbeddedServletContainerFactory f = new JettyEmbeddedServletContainerFactory(
                port);
     
        return f;
    }
}

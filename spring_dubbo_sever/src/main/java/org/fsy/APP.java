package org.fsy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@EnableDubbo
public class APP 
{
    public static void main( String[] args )
    {
    	System.out.println("I am dubbo server");
    	SpringApplication.run(APP.class, args);
    }
    
    @Bean
    public EmbeddedServletContainerFactory createEmbeddedServletContainerFactory(
            // NO_UCD (unused code)
            @Value("${jetty.server.port:8001}") final int port) {
     
        final JettyEmbeddedServletContainerFactory f = new JettyEmbeddedServletContainerFactory(
                port);
     
        return f;
    }
}
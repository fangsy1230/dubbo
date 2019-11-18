package org.fsy.dubbo;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Component
@Service(version = "1.0.0",interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHello(String name) {
		return "hello" + name;
	}

}

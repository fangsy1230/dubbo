package org.fsy.comsurmer;

import org.fsy.dubbo.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class HelloController {
	
	@Reference(version = "1.0.0")
	HelloService cservice;
	
	@GetMapping("sayHello")
	public String sayHello(String name){
		System.out.println("+++++++++++++++++++++++");
		System.out.println(cservice);
		return cservice.sayHello(name);
	}

}
   
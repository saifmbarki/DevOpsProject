package net.saifmbarki.DevOpsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DevOpsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsProjectApplication.class, args);
	}

	
	@GetMapping("/")
	public String hello() {
		return "<h1> Devops Project: using java spring-boot maven jenkins ansible docker k8s and aws / lets try jenkins  by saif mbarki";
}
}
package net.saifmbarki.DevOpsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@Service
public class DevOpsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsProjectApplication.class, args);
	}

	
	@GetMapping("/")
	public String hello() {
		return "<h1> creer une nouvelle branche, faire changement, push, et faire un PR : mvn clean package --skip-tetst</h1><i> saif mbarki</i> ";
	}
	
	
	public Integer calc() {
		Integer x = 5;
		Integer y = 6;
		return x+y;
	}
}
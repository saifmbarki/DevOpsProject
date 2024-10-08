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
		return "<h1> Cette application est deployer sur une instance ec2 aws avec un repo sur github, et une chaine cicd avec jenkins qui est aussi deployer sur ue instance ec2, a chaque fois ou il ya un changement dans le repo git, un build est executé, une image docker est creer, et une container docker est executer </h1> ";
}
}
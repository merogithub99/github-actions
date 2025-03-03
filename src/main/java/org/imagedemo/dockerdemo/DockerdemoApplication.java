package org.imagedemo.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DockerdemoApplication {


	@GetMapping("/welcome")
	public  String welcome(){
		return "welcome to the docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}

//	…or create a new repository on the command line
//	echo "# github-actions" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/merogithub99/github-actions.git
//	git push -u origin main
//…or push an existing repository from the command line
//	git remote add origin https://github.com/merogithub99/github-actions.git
//	git branch -M main
//	git push -u origin main

}

package net.ducatillon.joke.jokeapp;

import net.ducatillon.joke.jokeapp.controllers.JokeController;
import net.ducatillon.joke.jokeapp.services.JokeService;
import net.ducatillon.joke.jokeapp.services.JokeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JokeappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JokeappApplication.class, args);

		JokeServiceImpl serviceImpl = (JokeServiceImpl) ctx.getBean("jokeServiceImpl");

		System.out.println(serviceImpl.getJoke());

		// JokeService service = (JokeService) ctx.getBean("jokeService");

		// will cause this error : No bean named 'jokeService' available

//		System.out.println(service.getJoke());

	}

}

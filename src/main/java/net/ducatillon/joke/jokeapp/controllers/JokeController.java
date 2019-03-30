package net.ducatillon.joke.jokeapp.controllers;

import net.ducatillon.joke.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
@ResponseBody
public class JokeController {

  private final JokeService jokeService;

  public JokeController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  @GetMapping
  public String showJoke() {
    return jokeService.getJoke();
  }
}

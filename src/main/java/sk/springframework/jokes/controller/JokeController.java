package sk.springframework.jokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sk.springframework.jokes.services.JokeService;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping({"/getJoke", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}

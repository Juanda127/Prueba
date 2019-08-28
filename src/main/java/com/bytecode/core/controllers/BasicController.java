package com.bytecode.core.controllers;

import com.bytecode.core.configuration.Pages;
import com.bytecode.core.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/home")

public class BasicController {

    public List<Post> getPosts() {
        ArrayList<Post> post = new ArrayList<>();

        post.add(new Post(1, "Serbia formó un reino medieval que evolucionó hasta convertirse en un imperio que alcanzó su máxima extensión en el siglo XIV", "http://localhost:9898/greeting/post.jpg", new Date(), "Serbian History I"));
        post.add(new Post(2, "Serbia formó un reino medieval que evolucionó hasta convertirse en un imperio que alcanzó su máxima extensión en el siglo XIV", "http://localhost:9898/greeting/post.jpg", new Date(), "Serbian History II"));
        post.add(new Post(3, "Serbia formó un reino medieval que evolucionó hasta convertirse en un imperio que alcanzó su máxima extensión en el siglo XIV", "http://localhost:9898/greeting/post.jpg" , new Date(), "Serbian History III"));
        post.add(new Post(4, "Serbia formó un reino medieval que evolucionó hasta convertirse en un imperio que alcanzó su máxima extensión en el siglo XIV", "http://localhost:9898/greeting/post.jpg", new Date(), "Serbian History IV"));
        return post;
    }

    ;

    @GetMapping(path = {"/post", "/"})

    public String greeting(Model model) {
        model.addAttribute("posts", this.getPosts());
        return "greeting.html";
    }

    @GetMapping(path ="/public")
    public ModelAndView post() {
        ModelAndView modelAndView = new ModelAndView(Pages.HOME);
        modelAndView.addObject("posts", this.getPosts());
        return modelAndView;
    }

}

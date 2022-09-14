package br.com.rodrigoeduque.blog.controller;

import br.com.rodrigoeduque.blog.model.Post;
import br.com.rodrigoeduque.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/posts")
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = blogService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

    @GetMapping("/posts/{id}")
    public ModelAndView getPostDetails(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("postDetail");
        Post post = blogService.findById(id);
        mv.addObject("post", post);
        return mv;
    }

}

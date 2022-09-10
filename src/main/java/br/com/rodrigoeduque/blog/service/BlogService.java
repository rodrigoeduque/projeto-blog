package br.com.rodrigoeduque.blog.service;

import br.com.rodrigoeduque.blog.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findAll();
    Post findById(Long id);
    Post save(Post post);

}

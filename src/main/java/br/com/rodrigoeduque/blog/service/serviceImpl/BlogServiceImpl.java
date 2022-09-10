package br.com.rodrigoeduque.blog.service.serviceImpl;

import br.com.rodrigoeduque.blog.model.Post;
import br.com.rodrigoeduque.blog.repository.BlogRepository;
import br.com.rodrigoeduque.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository repository;

    @Override
    public List<Post> findAll() {

        return repository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return repository.save(post);
    }
}

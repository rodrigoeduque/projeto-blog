package br.com.rodrigoeduque.blog.utils;

import br.com.rodrigoeduque.blog.model.Post;
import br.com.rodrigoeduque.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    BlogRepository repository;

    @PostConstruct
    public void savePosts(){
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Rodrigo Duque");
        post1.setTitulo("Começando com SpringBoot 2");
        post1.setDataCriacao(LocalDate.now());
        post1.setTexto("Hoje vamos criar uma aplicação Spring Boot 2 de forma bem didática e detalhada. Vamos expor um endpoint para nos dizer Hello World. É algo super simples e que em poucos minutos estará prontinho. Esse projeto será uma base para futuros projetinhos que temos em mente para o futuro do blog."
        );

        Post post2 = new Post();
        post2.setAutor("Tony Stark");
        post2.setDataCriacao(LocalDate.now());
        post2.setTitulo("Apresentando o Java 14 e suas novidades");
        post2.setTexto("Na tarde de ontem, 17 de março de 2020 a Oracle anunciou a chegada do Java SE 14, junto de sua implementação Java Development Kit versão 14, vulgo JDK 14.");

        postList.add(post1);
        postList.add(post2);

        for(Post post : postList){
            Post save = repository.save(post);
            System.out.println("ID salvo : " + save.getId());
        }

    }
}

package com.vitoreduardo.workshopmongo.services;

import com.vitoreduardo.workshopmongo.domain.Post;
import com.vitoreduardo.workshopmongo.domain.User;
import com.vitoreduardo.workshopmongo.dto.UserDTO;
import com.vitoreduardo.workshopmongo.repository.PostRepository;
import com.vitoreduardo.workshopmongo.repository.UserRepository;
import com.vitoreduardo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }

    public List<Post> findByTitle(String text) {
        return postRepository.searchTitle(text);
    }
}

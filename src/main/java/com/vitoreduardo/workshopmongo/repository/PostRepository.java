package com.vitoreduardo.workshopmongo.repository;

import com.vitoreduardo.workshopmongo.domain.Post;
import com.vitoreduardo.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);

}

package com.vitoreduardo.workshopmongo.resources;

import com.vitoreduardo.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User vitor = new User(1L, "Vitor Eduardo", "vitor@gmail.com");
        User alex = new User(2L, "Alex Green", "alex@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(vitor, alex));

        return ResponseEntity.ok().body(list);
    }
}

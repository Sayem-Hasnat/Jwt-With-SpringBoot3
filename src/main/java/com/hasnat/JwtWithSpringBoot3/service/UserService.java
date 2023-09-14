package com.hasnat.JwtWithSpringBoot3.service;

import com.hasnat.JwtWithSpringBoot3.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    //Data initialize
    public UserService() {
       store.add(new User(UUID.randomUUID().toString(),"Sayem ","sayem.hasnat.dev@gmail.com"));
       store.add(new User(UUID.randomUUID().toString(),"Hasnat","hasnat.dev@gmail.com"));
       store.add(new User(UUID.randomUUID().toString(),"Mohammed","smohammed.dev@gmail.com"));
       store.add(new User(UUID.randomUUID().toString(),"hasan","hasan.dev@gmail.com"));
    }

    public List<User>  getUser() {
        return this.store;
    }
}

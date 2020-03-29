package com.summerproj.service;

import com.summerproj.entity.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public Person viewPerson() {
        return new Person("Chatri", "Ngambenchawong");
    }
}
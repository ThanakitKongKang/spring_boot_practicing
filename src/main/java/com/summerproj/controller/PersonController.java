package com.summerproj.controller;

import com.summerproj.entity.Person;
import com.summerproj.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String index(ModelMap model) {
        Person person = personService.viewPerson();
        // person - parameter แรก ถูกเอาไปใช้ที่หน้า UI
        model.addAttribute("person", person);
        // บอกว่าไฟล์เราอยู่ที่ Folder person ไฟล์ index.html
        return "person/index";
    }

    @RequestMapping("/hello3")
    public String index() {
        return "สวัสดีชาวโลก3";
    }
}
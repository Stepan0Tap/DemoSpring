package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.entity.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args){
        SpringApplication.run(Demo1Application.class, args);
//        Person person = new Person("John", "Snow");
//        System.out.println("First name: " + person.getFirstName());
//        System.out.println("Last name: " + person.getLastName());
    }
}

@Controller
class PersonController {
    @GetMapping("/")
    public String getPerson(Model model){
        Person person = new Person("John", "Show");
        model.addAttribute("person", person);
        return "person";
    }
}
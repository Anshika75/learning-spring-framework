package com.spring_tut.learning_spring_framework.springBasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {}
record Address(String city, String country) {}

@Configuration
public class FirstConfiguration {

    @Bean
    public String name() {
        return "John Doe";
    }

    @Bean
    public int age() {
        return 25;
    }

    @Bean
    public Person person() {
        return new Person("Minni", 27, new Address("Paris", "USA"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean("address2")
    public Address address() {
        return new Address("New York", "USA");
    }

    @Bean
    public Person person3Parameter(String name, int age, Address address2){
        return new Person(name, age, address2);
    }


}

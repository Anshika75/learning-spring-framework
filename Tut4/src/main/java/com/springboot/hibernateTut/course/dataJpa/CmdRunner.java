package com.springboot.hibernateTut.course.dataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {
    @Autowired
    private JpaDataRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Course(1, "The girl in the dark paradise", "Demilune75"));
        repo.save(new Course(2, "The paths that never diverged", "Demilune75"));
        repo.save(new Course(3, "The smile that faded", "Demilune75"));
        repo.save(new Course(4, "The lost soul", "Demilune75"));
        repo.save(new Course(5, "The untaken road", "Demilune75"));

        repo.deleteById(1l);

        System.out.println(repo.findById(2l));
        System.out.println(repo.findById(3l));
    }

}

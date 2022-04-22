package com.example.demo.configurations;

import com.example.demo.entities.students;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repo){
        return args -> {
            students Syafie = new students(
                    1,
                    "Syafie Makmor",
                    27,
                    "Male",
                    "Football",
                    "Islam",
                    "Add 1",
                    "Add 2",
                    "Add 3",
                    "Mailing Add",
                    "Structural Engineer",
                    "Married"


            );
            students Muzafar = new students(
                    2,
                    "Muzafar Shah Marican",
                    27,
                    "Male",
                    "Sex",
                    "Islam",
                    "Tampines Street 12",
                    "Simei Street 1",
                    "Tampines Street 61",
                    "NTU Hall 7",
                    "Front-end Developer",
                    "Single"
            );
            repo.saveAll(
                    List.of(Syafie, Muzafar)
            );
        };
    }
}

package com.springboot.hibernateTut.course.dataJpa;


import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDataRepository extends JpaRepository<Course, Long> {

}
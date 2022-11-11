package com.student.ust.repository;

import com.student.ust.entity.Book;
import com.student.ust.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 @Repository
    public interface BookRepository extends JpaRepository<Book,Integer> {

    }



package com.student.ust.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name="student_ustbatch")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private int rollNo;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "student")
    @Column(name="book_id")
    private Set<Book> bookSet;
}

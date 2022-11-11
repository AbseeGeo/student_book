package com.student.ust.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="book_ust_details")
public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int bookId;
        private int isbnNumber;
        private String bookName;
        private String authorName;
        private LocalDateTime createDate;
        private LocalDateTime modifyDate;

        @ManyToOne
        private Student student;
}








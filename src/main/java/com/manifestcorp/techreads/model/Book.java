package com.manifestcorp.techreads.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
   @NonNull
    String title ;
    @NonNull
    String cover ;
   @NonNull
    String author;
   @NonNull
    float rating ;
   @NonNull
    String status ;
   @NonNull
    String comment;

//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//    public String getTitle() { return title; }
//    public void setTitle(String title) { this.title = title; }
//  public Book(String title) { this.title = title; }
//
//    public Book(@NonNull String title, @NonNull String cover, @NonNull String author, @NonNull float rating, @NonNull String status, @NonNull String comment) {
//        this.title = title;
//        this.cover = cover;
//        this.author = author;
//        this.rating = rating;
//        this.status = status;
//        this.comment = comment;
//    }


//    public Book() {}


}

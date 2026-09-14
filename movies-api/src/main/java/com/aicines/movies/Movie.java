package com.aicines.movies;

import jakarta.persistence.*;

@Entity 
@Table(name = "movie")
public class Movie {

            @Id 
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;

            private String title;
            private String genre;
            private String rating;

            public Movie() {                
            }

            public Long getId() {return id;}
            public void setId(Long id) {this.id = id;}

            public String getTitle() {return title;}
            public void setTitle(String title) {this.title = title;}

            public String getGenre() {return genre;}
            public void setGenre(String genre) {this.genre = genre;}

            public String getRating() {return rating;}
            public void setRating(String rating) {this.rating = rating;}
}

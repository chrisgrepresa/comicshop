package com.antifaz.comicshop.dao;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="comics")
public class Comic {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column (name = "comic_id")
    private Integer comicId;

    //@Column (name = "title")
    private String title;

    //@Column (name = "volume")
    private Integer volume;

    //@Column (name = "author")
    private String author;

    //@Column (name = "genre")
    private String genre;

    //@Column (name = "publishing_house")
    private String publishingHouse;

    @Temporal(TemporalType.DATE)
    //@Column (name = "publishing_year")
    private Date publishingYear;

    //@Column (name = "stock")
    private Integer stock;

    @OneToMany(mappedBy= "comic")
    private List<ComicSale> comicSales;
}

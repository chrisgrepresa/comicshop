package com.antifaz.comicshop.dao;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name= "comic_sales")
public class ComicSale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "sale_id")
    private Integer saleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comic_id")
    private Comic comic;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //@Column(name = "sold_on")
    private Date soldOn;


}

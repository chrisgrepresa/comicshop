package com.antifaz.comicshop.repository;

import com.antifaz.comicshop.dao.ComicSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicSaleRepository extends JpaRepository<ComicSale,Integer> {
}

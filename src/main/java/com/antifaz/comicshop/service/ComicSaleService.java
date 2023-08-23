package com.antifaz.comicshop.service;

import com.antifaz.comicshop.dao.ComicSale;
import com.antifaz.comicshop.repository.ComicSaleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ComicSaleService {
    private final ComicSaleRepository comicSaleRepository;

    public List<ComicSale> findAllComicSale(){
        return comicSaleRepository.findAll();
    }
}

package com.antifaz.comicshop.controller;

import com.antifaz.comicshop.dao.ComicSale;
import com.antifaz.comicshop.service.ComicSaleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class ComicSaleController {
    private final ComicSaleService comicSaleService;

    @GetMapping("/searchAllComicSale")
    public List<ComicSale> searchAllComicSale(){
        return comicSaleService.findAllComicSale();
    }
}

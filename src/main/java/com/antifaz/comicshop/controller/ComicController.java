package com.antifaz.comicshop.controller;

import com.antifaz.comicshop.dao.Comic;
import com.antifaz.comicshop.service.ComicService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ComicController {

    private final ComicService comicService;

    @GetMapping("/findAllComic")
    public List<Comic> findAllComic(){
        return comicService.findAllComics();
    }

}

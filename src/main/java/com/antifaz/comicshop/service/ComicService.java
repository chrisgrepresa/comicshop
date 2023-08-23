package com.antifaz.comicshop.service;

import com.antifaz.comicshop.dao.Comic;
import com.antifaz.comicshop.repository.ComicRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ComicService {
    private final ComicRepository comicRepository;

    @Transactional
    public List<Comic> findAllComics(){
        return comicRepository.findAll();
    }
}

package com.antifaz.comicshop.repository;

import com.antifaz.comicshop.dao.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicRepository extends JpaRepository<Comic,Integer> {
}

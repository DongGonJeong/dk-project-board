package com.dk.dk_project_board.repository;

import com.dk.dk_project_board.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {


}

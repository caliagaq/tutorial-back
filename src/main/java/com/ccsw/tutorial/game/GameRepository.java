package com.ccsw.tutorial.game;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ccsw.tutorial.game.model.Game;

/**
 * 
 * @author caliagaq
 *
 */
public interface GameRepository extends CrudRepository<Game, Long> {

    @Query("select g from Game g where (:title is null or g.title like '%'||:title||'%') and (:category is null or g.category.id = :category)")
    @EntityGraph(attributePaths = {"category", "author"})
    List<Game> find(@Param("title") String title, @Param("category") Long category);
}

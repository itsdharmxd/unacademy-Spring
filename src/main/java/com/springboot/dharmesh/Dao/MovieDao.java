package com.springboot.dharmesh.Dao;

import com.springboot.dharmesh.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MovieDao extends JpaRepository<Movies,Integer> {

  public List<Movies> findByMovieName(String movieName);
  public List<Movies> findByMovieNameAndDuration(String name, int duration);
  public List<Movies> findByReleaseDateBetween(LocalDateTime start, LocalDateTime end);
  public List<Movies> findByDurationGreaterThanEqual(int duration);
  public List<Movies> findByReleaseDateAfter(LocalDateTime releaseDate);
  public List<Movies> findByMovieNameContaining(String movieName);
  public List<Movies> findByMovieNameIgnoreCase(String movieName);

}

package com.dcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>{

	List<Movie> findByMovieName(String movieName);
	
	List<Movie> findByLanguage(String language);
	
	List<Movie> findByMovieNameStartsWith(String movieName);
	
	List<Movie> findByMovieIdGreaterThan(Integer movieId);
	
	List<Movie> findByMovieNameAndLanguage(String movieName, String language);
	
	@Query(value="SELECT * FROM MOVIE WHERE MOVIE_NAME=?",nativeQuery = true)
	List<Movie> getByMovieName(String movieName);
	
	@Query("FROM Movie WHERE certification=:certification")
	List<Movie> getByCertification(String certification);
	
	@Query("SELECT m FROM Movie m WHERE m.language=:language")
	List<Movie> getByLanguage(String language);
}

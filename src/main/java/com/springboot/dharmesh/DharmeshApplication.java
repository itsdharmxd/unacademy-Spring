package com.springboot.dharmesh;

import com.springboot.dharmesh.Dao.MovieDao;
import com.springboot.dharmesh.entities.Movies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class DharmeshApplication {

	public static void main(String[] args) {
     ApplicationContext ctx= SpringApplication.run(DharmeshApplication.class, args);
     MovieDao movieDao= ctx.getBean(MovieDao.class);
		System.out.println(movieDao);
		Movies movies =new Movies();

		movies.setMovieName("Super 30");
movies.setMovieDescription("Agood movie");
movies.setDuration(150);
movies.setCoverPhotoUrl("cover photo");
movies.setReleaseDate(LocalDateTime.now());
movies.setTrailerUrl("trailer url");

		Movies savedobject =movieDao.save(movies);

		// delete
//		movieDao.delete();
 List<Movies> savedobjec= movieDao.findByMovieName("Super 30");

//     public List<Movies> a=movieDao.findByDuration

		System.out.println("Spring boot activated");
		System.out.println(savedobjec);
	}

}

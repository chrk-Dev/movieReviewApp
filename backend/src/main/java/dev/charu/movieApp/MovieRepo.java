package dev.charu.movieApp;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepo extends MongoRepository<Movie,ObjectId>  {



Optional <Movie> getMovieByimdbId(String imdbId);

//Optional<Movie> getMovieByTitle(string title);

//Optional<Movie> getMovieByYear(string year);




}

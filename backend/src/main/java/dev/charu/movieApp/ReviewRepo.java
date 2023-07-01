package dev.charu.movieApp;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends MongoRepository<Review,ObjectId>  {






//Optional<Movie> getMovieByTitle(string title);

//Optional<Movie> getMovieByYear(string year);




}

package dev.charu.movieApp;

import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    

@Autowired
private MovieRepo movieRepo;

    public List<Movie> allmovie(){



        return  movieRepo.findAll();


    }

    public Optional<Movie> getMovieById(ObjectId id){
        return movieRepo.findById(id);
    }

public Optional<Movie> getMovieByIMTBId(String IMTBID){

    return movieRepo.getMovieByimdbId(IMTBID);
}



}

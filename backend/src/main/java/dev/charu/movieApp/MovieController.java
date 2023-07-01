package dev.charu.movieApp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
    
    @Autowired
    private MovieService movieService;


    @CrossOrigin(origins = "*", maxAge = 3600)
    @GetMapping("/")
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allmovie(), HttpStatus.OK);
        

    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable ObjectId id){
    //     return new ResponseEntity<Optional<Movie>>(movieService.getMovieById(id), HttpStatus.OK);
        
    
    // }

    @GetMapping("imdbId/{imdbId}")
    public ResponseEntity<Optional<Movie>> getMovieByimdbId(@PathVariable("imdbId") String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.getMovieByIMTBId(imdbId), HttpStatus.OK);
        
    }


}






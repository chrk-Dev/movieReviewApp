package dev.charu.movieApp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;



@Service
public class ReviewService {
    

@Autowired
private ReviewRepo reviewRepo;

@Autowired
private MongoTemplate mongoTemplate;

public Review creatReview(String reviewBody,String imtbId){

    Review review=new Review(reviewBody,LocalDateTime.now(),LocalDateTime.now());

reviewRepo.insert(review);


mongoTemplate.update(Movie.class)
            .matching(Criteria.where("imdbId").is(imtbId))
            .apply(new Update().push("reviews").value(review))
            .first();

return review;

}

}

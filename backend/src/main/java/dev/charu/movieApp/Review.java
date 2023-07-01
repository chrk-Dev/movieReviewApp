package dev.charu.movieApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection  = "reviews")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Review {

   @Id
    private ObjectId id;

    private String body;
    private LocalDateTime created;
    private LocalDateTime updated;
    
    public Review(String body, LocalDateTime created, LocalDateTime updated) {
        this.body = body;
        this.created = created;
        this.updated = updated;
    }



    
}

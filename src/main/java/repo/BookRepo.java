package repo;

import model.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends MongoRepository<Libro, Long> {


    @Query("{"autore", ?0}")
   return
    }
}

package SimpleAPI.springbookmongodbapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
    // Additional custom queries can be added here
    //just to add a comment
}

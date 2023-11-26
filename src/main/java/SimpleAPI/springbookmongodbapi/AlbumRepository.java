package SimpleAPI.springbookmongodbapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album, String> {
    // Additional custom queries can be added here
}

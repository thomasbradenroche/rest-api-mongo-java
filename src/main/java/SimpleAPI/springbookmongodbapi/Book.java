package SimpleAPI.springbookmongodbapi;

// Book.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;

    // getters and setters

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }
}

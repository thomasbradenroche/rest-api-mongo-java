package SimpleAPI.springbookmongodbapi;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    public static void main(String[] args) {
        // Replace the connection string with your actual MongoDB Atlas connection string
        String connectionString = "mongodb+srv://admin:!A7xrules!@fitnessapp.66ifsxi.mongodb.net/?retryWrites=true&w=majority/test";

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Access the MongoDB database
            MongoDatabase database = mongoClient.getDatabase("<database-name>");

            // Your MongoDB operations go here
            // ...

            System.out.println("Connected to MongoDB successfully");
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }
}
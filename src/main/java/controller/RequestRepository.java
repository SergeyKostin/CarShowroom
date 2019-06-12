package controller;

import model.Request;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestRepository extends MongoRepository<Request, String> {
    public Request findByDateTime(String dateTime);
}

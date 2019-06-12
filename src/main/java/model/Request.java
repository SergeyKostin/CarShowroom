package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "request")
public class Request {
    @Id
    private String id;
    private Client client;
    private String goal;
    private String model;
    private String dateTime;

    public Request(Client client, String goal, String model, String dateTime) {
        this.client = client;
        this.goal = goal;
        this.model = model;
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

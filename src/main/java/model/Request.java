package model;

public class Request {
    private Client client;
    private String goal;
    private String model;

    public Request(Client client, String goal, String model) {
        this.client = client;
        this.goal = goal;
        this.model = model;
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

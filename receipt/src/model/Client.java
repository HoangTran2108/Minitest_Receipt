package model;

public class Client {
    private String name;
    private String homeNumber;
    private String id;

    public Client(String name, String homeNumber, String id) {

        this.name = name;
        this.homeNumber = homeNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

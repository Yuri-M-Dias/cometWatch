package cometwatch.model;

/**
 * Created by root on 22/06/16.
 */
public class Comet {
    private String name;
    private String location;

    public Comet(String name) {
        this.name = name;
    }

    public Comet(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

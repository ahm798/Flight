package main.java.flight;

public class Airport {

    private String airport_code;
    private String city;


    public Airport() {
        this.airport_code = "unknown";
        this.city = "unknown";
    }

    public Airport(String city, String airport_code) {
        this.airport_code = airport_code;
        this.city = city;
    }


    public String getAirport_code() {
        return this.airport_code;
    }

    public String getCity() {
        return this.city;
    }
}

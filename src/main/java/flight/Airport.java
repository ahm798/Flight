package main.java.flight;

public class Airport {

    private String airport_code;
    private String city;


    public Airport() {
        this.airport_code = "unknown";
        this.city = "unknown";
    }

    public Airport(String airport_code, String city) {
        this.airport_code = airport_code;
        this.city = city;
    }


    public String getAirport_code() {
        return airport_code;
    }

    public String getCity() {
        return city;
    }
}

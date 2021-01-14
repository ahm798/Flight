package main.java.flight;
import java.util.Date;

public class Reservation{
    static int reservation_id;
    private java.util.Date dateCreated;
    private Passenger passenger;
    private Flight flight;

    Reservation(Passenger p,schedule f){
        ++reservation_id;
        dateCreated = new java.util.Date();
        reserve(p, f);
    }

    public void reserve(Passenger p, schedule f) {
        this.passenger = p;
        this.flight = f;
    }

}

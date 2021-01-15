package main.java.flight;
import java.util.Date;

public class Reservation{
    static int reservation_id;
    private java.util.Date dateCreated;
    private Passenger passenger;
    private schedule flight;
    private String seat;

    Reservation(Passenger p,schedule f, String seat){
        ++reservation_id;
        dateCreated = new java.util.Date();
        this.seat = seat;
        allocate(p, f);
    }

    public void allocate(Passenger p, schedule f) {
        this.passenger = p;
        this.flight = f;
        flight.allocate_seat(seat,passenger);
    }

}

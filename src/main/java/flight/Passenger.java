package main.java.flight;

public class Passenger extends Person{

    private final String passenger_email;
    private final String passenger_address;
    private final int passenger_id;

    Passenger(){
        super(null, 0, null);
        this.passenger_address = null;
        this.passenger_id = 0;
        this.passenger_email = null;
    }

    Passenger(String passenger_name, int passenger_age, String passenegr_gender,int passenger_id ,String passenger_email, String passenger_address) {
        super(passenger_name, passenger_age, passenegr_gender);
        this.passenger_id = passenger_id;
        this.passenger_email = passenger_email;
        this.passenger_address = passenger_address;
    }


    public int getPassenger_id() {
        return passenger_id;
    }

    public String getPassenger_email() {
        return passenger_email;
    }

    public String getPassenger_address() {
        return passenger_address;
    }
}
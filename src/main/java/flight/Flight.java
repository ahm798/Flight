package main.java.flight;

public class Flight{
    private String number;
    private Aircraft aircraft;

    Flight(String number, String r, String m, int nrow, int srow){
        this.number = number;
        this.aircraft = new Aircraft(r, m , nrow, srow);

    }

    public String number{
        return this.number;
    }

    public String aircraft_model(){
        return this.aircraft.model()
    }

    public String airline(){
        return this.number.substring(0, 2);
    }



    public allocate_seat(String seat, String passanger){
        
    }
}

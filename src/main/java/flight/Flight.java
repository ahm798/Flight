package main.java.flight;

public class Flight{
    private String number;
    private Aircraft aircraft;
    public Seat [][] flight_Seat;
    Flight(String number, String r, String m, int nrow, int srow){
        this.number = number;
        this.aircraft = new Aircraft(r, m , nrow, srow);
        flight_Seat =  aircraft.seating_plane();
    }


    public String flight_number(){
        return this.number;
    }

    public String aircraft_model(){
        return this.aircraft.model();
    }

    public String airline(){
        return this.number.substring(0, 2);
    }



    public void allocate_seat(String seat, String passanger){
        char letter = seat.charAt(seat.length() - 1);
        int row = Integer.parseInt(seat.substring(0,seat.length() -1));
        flight_Seat[row][aircraft.letters.indexOf(letter)].setPassanger(passanger);

    }
}

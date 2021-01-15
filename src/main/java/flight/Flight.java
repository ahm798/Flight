package main.java.flight;

public class Flight{
    private String number;
    private Aircraft aircraft;

    public Seat [][] flight_Seat;
    Flight(){}
    Flight(String number, String r, String m, int nrow, int srow){
        this.number = number;
        this.aircraft = new Aircraft(r, m , nrow, srow);
        flight_Seat =  aircraft.seating_plane();
    }


    public String getNumber(){
        return this.number;
    }

    public String getModel(){
        return this.aircraft.model();
    }

    public String getAirline(){
        return this.number.substring(0, 2);
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void allocate_seat(String seat, Passenger passanger) {
        char letter = seat.charAt(seat.length() - 1);
        int row = Integer.parseInt(seat.substring(0, seat.length() - 1));
        flight_Seat[row][aircraft.letters.indexOf(letter)].setPassanger(passanger);
    }

    public void view(){
        for(Seat[] row : flight_Seat){
            for(Seat s : row){
                try{
                    System.out.println(s.getPassanger());
                }
                catch(Exception e){
                    System.out.println(0);
                }
            }
        }
    }


}

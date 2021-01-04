package main.java.flight;

public class Home {
    public static void main (String[] args){
        Flight f = new Flight("Sh-431", "G-upt", "airbus 300", 22, 5);
        f.allocate_seat("12A", "ahmed abd elwahab");
        for(int i = 0; i < 22; i++){
            for(int  j = 0; j <5; j++){
                System.out.println(f.flight_Seat[i][j].getPassanger());
            }
        }
    }
}

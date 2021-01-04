package main.java.flight;

public class Home {
    public static void main (String[] args){
        Flight f = new Flight("Sh-431", "G-upt", "airbus 300", 22, 5);
        f.allocate_seat("12A", "ahmed abd elwahab");
    }
}

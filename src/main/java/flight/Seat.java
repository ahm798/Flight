package main.java.flight;


public class Seat{
    private char letter;
    private String passanger;

    Seat(){
    }

    Seat(char letter,  String passanger){
        this.letter = letter;
        this.passanger = passanger;
    }

    public void setPassanger(String passanger){
        this.passanger = passanger;
    }

    public String getPassanger(){
        return this.passanger;
    }

}

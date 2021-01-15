package main.java.flight;


public class Seat{
    private char letter;
    private Passenger passanger;

    Seat(){
    }

    Seat(char letter,  Passenger passanger){
        this.letter = letter;
        this.passanger = passanger;
    }

    public void setPassanger(Passenger passanger){
        this.passanger = passanger;
    }

    public Passenger getPassanger(){
        return this.passanger;
    }

    public char getLetter() {
        return letter;
    }

}

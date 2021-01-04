package main.java.flight;


public class Aircraft{
    private String registration, model;
    private int num_rows, num_seat_per_rows;
    public Seat [][] seating ;
    public String letters = "ABCDEFHGKL";


    Aircraft(){}
    Aircraft(String registration, String model, int num_rows, int num_seat_per_rows){
        this.registration = registration;
        this.model = model;
        this.num_seat_per_rows = num_seat_per_rows;
        this.num_rows = num_rows;
        seating = new Seat[num_rows][num_seat_per_rows];
    }

    public String  registration(){
        return this.registration;
    }

    public String model(){
        return this.model;
    }

    public  Seat[][] seating_plane(){
        char [] letters = "ABCDEFHGKL".substring(0, num_seat_per_rows).toCharArray();

        for(int i =0; i < num_rows; i++){
            for (int j =0; j < num_seat_per_rows; j++){
                seating[i][j] = new Seat(letters[j], null);
            }
        }
        return this.seating;
    }
}

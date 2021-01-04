package main.java.flight;


public class Aircraft{
    private String registration, model;
    private int num_rows, num_seat_per_rows;
    public Seat [][] seating ;

    Aircraft(){}
    Aircraft(String registration, String model, int num_rows, num_seat_per_rows){
        this.registration = registration;
        this.model = model;
        this.num_seat_per_rows = num_seat_per_rows;
        this.num_rows = num_rows;
    }

    public String  registration(){
        return this.registration;
    }

    public String model(){
        return this.model
    }

    def Seat[][] seating_plane{
        seating = new Seat[num_rows][num_seat_per_rows];
        seating[0][0] = NULL;
        String s = "ABCDEFHG".substring(0, num_seat_per_rows +1);
        char [] letters = s.toCharArray();
        for(int i = 0; i < num_rows; i++){
            for(int j = 0; j < num_seat_per_rows; j++){
                seating[i][j] = new seat(letters[j], NULL);
            }
        }
        return seating;
    }
}

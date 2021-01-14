package main.java.flight;
import java.util.Scanner;


public class Home {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        //array list here for all passanger
        // array list here for all schedule flights
        greeting();
    }

    public static void greeting(){
        System.out.println("welcome to airline reservation system");
        for(int i = 0; i < 50; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void option(int choice){
        int ch = choice;
        switch (ch){
            case 1:
                System.out.println("please insert all data of the new flight");
                schedule_new_flight();
                break;
            case 2:
                //view all flight to specfic destination entered by admin
                view_flight();
                break;
            case 3:
                reserve_flight();
                break;
            default:
                System.out.println("bad input!");
                break;
        }
    }

    public static void schedule_new_flight(){
        Scanner sc =new Scanner(System.in);
        String number, origin, destination;
        System.out.print("number: ");
        number = sc.nextLine();
        System.out.print("origin: ");
        origin = sc.nextLine();
        System.out.print("code of airport");
        String origin_code =sc.nextLine();
        System.out.print("destination: ");
        destination = sc.nextLine();
        System.out.print("code of destination ");
        String dest_code = sc.nextLine();
        System.out.print("duration: ");
        int duration = sc.nextInt();
        System.out.print("aircraft model: ");
        String model = sc.nextLine();
        System.out.print("aircraft registeration: ");
        String registeration = sc.nextLine();
        System.out.print("aircraft rows: ");
        int rows = sc.nextInt();
        System.out.print("seats per row");
        int seats = sc.nextInt();

        schedule f = new schedule(new Airport(origin, origin_code), new Airport(destination, dest_code), duration, number, registeration, model, rows, seats);
    }

    public static void view_flight(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter destination ");
        String destination = sc.nextLine();
        // for each flight in schdelue flights
        //    if destination is target
        //          view flight number , date , how many seat is empty
    }

    public static void reserve_flight(){
        //ask paseneger for his all data
        // create passenger object
        //ask passenger which flight is
        // allocat passeneger for target flight
    }
}

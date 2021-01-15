package main.java.flight;
import java.util.*;


public class Home {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        LinkedList<schedule> scheduleFlights = new LinkedList<schedule>();
        //array list here for all passanger
        // array list here for all schedule flights
        greeting();
        option(scheduleFlights);
    }

    public static void greeting(){
        System.out.println("welcome to airline reservation system");
        for(int i = 0; i < 50; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void option(LinkedList<schedule> scheduleFlights){
        Scanner sc =new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("please insert all data of the new flight");
                schedule_new_flight();
                break;
            case 2:
                //view all flight to specfic destination entered by admin
                view_flight(scheduleFlights);
                break;
            case 3:
                reserve_flight(scheduleFlights);
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

    public static void view_flight(LinkedList<schedule> flights){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter destination ");
        String dest = sc.nextLine();
        for(schedule flight: flights){
            if(flight.getOrigin().equals(dest)){
                System.out.print(flight.getNumber() + " | " +flight.getModel() +" | " +flight.getOrigin() + " | " + flight.getDestination() + " | " +
                        flight.getDuration() + " | " + flight.getDate() +" | ");
            }
        }
        //    if destination is target
        //          view flight number , date , how many seat is empty
    }

    public static void reserve_flight(LinkedList <schedule>scheduleFlights){
        //ask paseneger for his all data
        System.out.print("insert all data of passenger: \n");
        String name, email, address, gender;
        int age, id;
        Scanner sc = new Scanner(System.in);
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("age: ");
        age = sc.nextInt();
        System.out.println("id: ");
        id = sc.nextInt();
        System.out.println("gender: ");
        gender = sc.nextLine();
        System.out.println("address: ");
        address = sc.nextLine();
        System.out.println("email: ");
        email = sc.nextLine();
        // create passenger object
        System.out.println("which flight number do you want to reserve: ");
        String number = sc.nextLine();
        Passenger paseneger = new Passenger(name, age, gender,id, email, address);
        schedule flight =null;
        for(schedule f: scheduleFlights){
            if(f.getNumber().equals(number))
                flight = f;
        }
        System.out.println("which seat number do you want to reserve: ");
        String seat = sc.nextLine();
        Reservation newReservation = new Reservation(paseneger, flight, seat);
        //ask passenger which flight is

        // allocat passeneger for target flight
    }
}

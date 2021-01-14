package main.java.flight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class schedule extends Flight{
    private Airport origin;
    private Airport destination;
    private int duration;
    private String date;
    schedule(){}
    schedule(Airport origin, Airport destination, int duration, String n, String r, String m, int nr, int sr){
        super(n , r, m , nr, sr);
        this.origin = origin;
        this.destination = destination;
        this.duration = duration;
        LocalDateTime localDateTime = LocalDateTime.parse(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.date = localDateTime.format(formatter);
    }

    public  String date(){
        return date;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public int getDuration() {
        return duration;
    }
}
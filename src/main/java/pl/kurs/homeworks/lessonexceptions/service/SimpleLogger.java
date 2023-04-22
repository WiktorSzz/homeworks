package pl.kurs.homeworks.lessonexceptions.service;

import java.sql.Timestamp;
import java.time.Instant;

public class SimpleLogger {

    private String[] exceptions;
    private int counter;

    public SimpleLogger(int capacity) {
        this.exceptions = new String[capacity];
    }

    public void log(Exception e) {
        Timestamp timestamp = Timestamp.from(Instant.now());
        String info = timestamp +"//"+ String.valueOf(e);
        if (e == null) {
            System.out.println("Nie zarejestrowano żadnych wyjątków.");
        } else {
            exceptions[counter++] = info;
        }

    }

    public void printLogs() {
        if (counter == 0) {
            System.out.println("Nie zarejestrowano żadnych wyjątków.");
        } else {
            for (int i = 0; i < counter; i++) {
                System.out.println("Wyjątek nr " + (i + 1) + ": " + exceptions[i]);
            }
        }
    }
}





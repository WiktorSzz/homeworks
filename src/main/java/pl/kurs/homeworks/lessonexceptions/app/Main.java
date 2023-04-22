package pl.kurs.homeworks.lessonexceptions.app;

import pl.kurs.homeworks.lessonexceptions.service.SimpleLogger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SimpleLogger logger = new SimpleLogger(100);


        Scanner scanner = new Scanner(System.in);
        String[] names = {"Adam", "Ewa"};

        boolean errorOccurs = true;

        do {
            try {
                System.out.println("Podaj liczbę całkowitą: ");
                int userNumber = scanner.nextInt();
                System.out.println("Podana liczba to: " + userNumber);
                System.out.println("Podaj indeks dowolnego imienia z tablicy");
                System.out.println("Wybrane imie: " + names[scanner.nextInt()]);
                errorOccurs = false;
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                //System.err.println("Podano błędne dane!");
                logger.log(e);
                System.err.println(e.getMessage() != null ? e.getMessage() : "Podano błędne dane!");

//          } catch (ArrayIndexOutOfBoundsException e){
//              System.err.println(e.getMessage());
            } finally {
                //blok który zawsze się wykonuje bez względu na wystąpienie czy nie wystapienie wyjatku
                System.out.println("Odpalenie bloku finally");
                scanner.nextLine();
            }
        } while (errorOccurs);


        System.out.println("Dalsze instrukcje...");
        scanner.close();


        logger.printLogs();

    }
}
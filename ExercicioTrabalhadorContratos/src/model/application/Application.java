package model.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.entities.DomainException;
import model.entities.enums.WorkerLevel;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), fmt);

            WorkerLevel workerLevel = new WorkerLevel(number, checkIn, checkOut);
            System.out.println("WorkerLevel: " + workerLevel);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), fmt);

            workerLevel.updateDates(checkIn, checkOut);
            System.out.println("WorkerLevel: " + workerLevel);
        }
        catch (DateTimeParseException e) {
            System.out.println("Invalid date format.");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }

        sc.close();
    }
}
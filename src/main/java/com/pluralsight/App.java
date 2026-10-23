package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[20];
        int totalVehicles = 0;

        vehicles[0] = new Vehicle(101121,"Ford Explorer","Red",45000,13500);
        vehicles[1] = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        vehicles[2] = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        vehicles[3] = new Vehicle(101124,"Honda Civic","White",70000,7500);
        vehicles[4] = new Vehicle(101125,"Subaru Outback","Green",55000,14500);
        vehicles[5] = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);

        int i = 0;
        for(Vehicle vehicle : vehicles){
            if(vehicles[i] != null){
                totalVehicles += 1;
            }
            i++;
        }

        int command = printMenu(input);
        input.nextLine();

        switch (command){
            case 1-> listVehicles(vehicles);
            case 2-> searchByModel(input, vehicles);
            case 4-> searchByColor(input, vehicles);
            case 5-> addAvehicle(input, vehicles);
            case 6-> System.out.println("Goodbye!");
            default -> System.out.println("Invalid Input!");
        }

    }

    public static int printMenu(Scanner input){
        System.out.print("""
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit
                Enter your command:\s""");

        return input.nextInt();
    }

    public static void listVehicles (Vehicle[] v){
        int i = 0;

        for(Vehicle vehicle : v){
            if(v[i] != null){
                System.out.println(vehicle.toString());
            }
            i++;
        }
    }

    public static void searchByModel(Scanner input, Vehicle[] vehicles){
        System.out.print("Enter Make/Model: ");
        String makeModel = input.nextLine();

        for(Vehicle vehicle : vehicles){
            if(vehicle != null && vehicle.getMakeModel().equalsIgnoreCase(makeModel)){
                System.out.println(vehicle);
            }
        }

    }

    public static void searchByPriceRange(Scanner input, Vehicle[] vehicles){
        System.out.print("Enter Make/Model: ");
        String makeModel = input.nextLine();

        for(Vehicle vehicle : vehicles){
            if(vehicle != null && vehicle.getMakeModel().equalsIgnoreCase(makeModel)){
                System.out.println(vehicle);
            }
        }

    }

    public static void searchByColor(Scanner input, Vehicle[] vehicles){
        System.out.print("Enter Vehicle Color: ");
        String makeModel = input.nextLine();

        for(Vehicle vehicle : vehicles){
            if(vehicle != null && vehicle.getColor().equalsIgnoreCase(makeModel)){
                System.out.println(vehicle);
            }
        }

    }

    public static void addAvehicle(Scanner input, Vehicle[] vehicles) {
        //Vehicle[] vehicle = new Vehicle[1];

        System.out.print("Vehicle ID: ");
        long vechicleId = input.nextLong();
        input.nextLine();

        System.out.print("Make/Model: ");
        String makeModel = input.nextLine();

        System.out.print("Color Of Vehicle: ");
        String color = input.nextLine();

        System.out.print("Odometer: ");
        int odometerReading = input.nextInt();

        System.out.print("Price: ");
        double price = input.nextDouble();

        int i = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle == null) {
                vehicles[i] = new Vehicle(vechicleId, makeModel, color, odometerReading, price);
            }
        }


        //vehicle[0] = new Vehicle(vechicleId, makeModel, color, odometerReading, price);
        //return vehicle[0];
    }
}

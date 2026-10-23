package com.pluralsight;

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

        System.out.println(totalVehicles);

        int menuDecision = printMenu(input);

        System.out.println(menuDecision);
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

        int menuInput = input.nextInt();
        return menuInput;
    }
}

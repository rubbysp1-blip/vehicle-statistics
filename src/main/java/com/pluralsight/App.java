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

        //System.out.println(Arrays.toString(vehicles));
//        System.out.println(totalVehicles);
//
        int command = printMenu(input);
        //System.out.println(command);
        switch (command){
            case 1: listVehicles(vehicles);
            break;
            case 2: searchByModel(input, vehicles);
            break;
            case 5: addAvehicle(input);
            break;
        }

        //System.out.println(listVehicles(vehicles));

//        Vehicle newVehicels = addAvehicle(input);
//        Vehicle[] newVehicel = {newVehicels};
//
//        for(Vehicle vehicleInput : newVehicel){
//            System.out.println(vehicleInput.getColor());
//
//        }
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
        //int totalVehicles = 0;
        //Vehicle v = {vehicles};

        for(Vehicle vehicle : v){
            if(v[i] != null){
                System.out.println(vehicle.toString());
            }
            i++;
        }
        //return totalVehicles;
    }

    public static int searchByModel(Scanner input, Vehicle[] vehicles){
        System.out.println("Enter Make/Model: ");
        String makeModel = input.nextLine();

        for(Vehicle vehicle : vehicles){
            if(makeModel.equals(vehicle.getMakeModel())){
                System.out.println(vehicle.getVehicleId());
                System.out.println(vehicle.getMakeModel());
                System.out.println(vehicle.getColor());
                System.out.println(vehicle.getOdometerReading());
                System.out.println(vehicle.getPrice());
            }
        }
        //System.out.println(makeModel);
        return 1;

    }

    public static Vehicle addAvehicle(Scanner input){
        Vehicle[] vehicle = new Vehicle[1];

        System.out.print("Vehicle ID: ");
        long vechicleId = input.nextLong();
        input.nextLine();

        System.out.print("Make/Model: ");
        String makeModel = input.nextLine();
        //input.nextLine();

        System.out.print("Color Of Vehicle: ");
        String color = input.nextLine();
        //input.nextLine();

        System.out.print("Odometer: ");
        int odometerReading = input.nextInt();

        System.out.print("Price: ");
        double price = input.nextDouble();

        vehicle[0] = new Vehicle(vechicleId, makeModel, color, odometerReading, price);
        return vehicle[0];
    }
}

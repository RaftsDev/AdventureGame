package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	// Create rooms
        locations.put(0,new Location(0,"Central room"));
        locations.put(1, new Location(1,"Northern room"));
        locations.put(2,new Location(2,"Eastern room"));
        locations.put(3,new Location(3,"Western room"));
        locations.put(4,new Location(4,"Southern room"));

        //Add exits to each room

        locations.get(0).addExit("N",1);
        locations.get(0).addExit("E",2);
        locations.get(0).addExit("W",3);
        locations.get(0).addExit("S",4);

        locations.get(1).addExit("E",2);
        locations.get(1).addExit("S",0);

        locations.get(2).addExit("W",0);
        locations.get(2).addExit("N",1);

        locations.get(3).addExit("E",0);

        locations.get(0).addExit("N",1);

        //Code of walking

        Scanner scanner = new Scanner(System.in);

        int roomNumber = 0;
        String direction;
        while(true){
            //print current location
            System.out.println("Your are in: "+locations.get(roomNumber).getDescription());
            System.out.println("Your exits: ");
            for(String key : locations.get(roomNumber).getExits().keySet()){
                System.out.print(locations.get(roomNumber).getExits().get(key));
            }

            direction = scanner.nextLine().toUpperCase();
            //direction = "Q";
            System.out.println("direction: "+direction);
            if(direction.equals("Q")){
                System.out.println("Qiuting...");
                break;
            }
            System.out.println("Your choose direction: "+direction);

            if(locations.get(roomNumber).getExits().containsKey(direction)){
                System.out.println("You going to: "+direction);
                roomNumber = locations.get(roomNumber).getExits();
            }else{
                System.out.println("No exit in this direction");
            }

        }

    }
}

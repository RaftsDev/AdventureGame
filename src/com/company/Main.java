package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
	// Create rooms
        locations.put(0,new Location(0,"Central room"));
        locations.put(1, new Location(1,"Northern room"));
        locations.put(2,new Location(2,"Eastern room"));
        locations.put(3,new Location(3,"Western room"));
        locations.put(4,new Location(4,"Southern room"));




    }
}

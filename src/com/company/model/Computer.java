package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Peripheral> peripheralList;
    private String producer;
    private String type;

    public Computer(String producer, String type) {
        peripheralList = new ArrayList<Peripheral>();
        this.producer = producer;
        this.type = type;

    }

    public void addPeripheral(Peripheral peripheral) {

        peripheralList.add(peripheral);

    }

    public String displayPeripherals() {
        String toReturn = "My computer is made of: \n";
        int i;
        for(i = 0 ; i< peripheralList.size() ; i++)  {
            toReturn = toReturn +
                    peripheralList.get(i).displayName() +
                    "\n";
        }
        return toReturn;
    }
}

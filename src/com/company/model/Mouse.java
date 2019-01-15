package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Mouse extends Peripheral
        implements BallCharacteristic,
        WiredInterface,
        OpticalCharacteristic {
    private int nrOfButtons;
    private List<String> characteristics;

    /**
     * This is a constructor that accepts
     *
     * @param name String that gives a property called name to my ibject
     */
    public Mouse(String name, int nrOfButtons) {
        super(name);
        this.nrOfButtons = nrOfButtons;
        characteristics = new ArrayList<String>();
    }


    @Override
    public void setBallMaterial(String material) {
        characteristics.add("Ball material is : " + material);
    }

    @Override
    public void setCableLength(int length) {
        characteristics.add("Cable length " + length);
    }

    public String displayCharacteristics() {
        String text = "My mouse has: \n";
        for (String characteristic : characteristics) {
            text += characteristic;
        }
        return text;
    }
}

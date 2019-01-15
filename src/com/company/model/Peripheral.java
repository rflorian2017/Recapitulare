package com.company.model;

public abstract class Peripheral {
    private String name;

    private String resolution;

    /**
     * This is a constructor that accepts
     * @param name String that gives a property called name to my ibject
     */
    public Peripheral(String name) {
        this.name = name;
    }



    public String displayName() {
        return this.name;
    }
}

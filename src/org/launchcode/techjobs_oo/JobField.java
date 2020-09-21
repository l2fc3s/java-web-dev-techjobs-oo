package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    /*
    What fields do ALL FOUR of the classes have in common?
    **id, nextId, value

    Which constructors are the same in ALL FOUR classes?
    **id constructor, value constructor,

    What getters and setters do ALL of the classes share?
    **getId, getValue, setValue

    Which custom methods are identical in ALL of the classes?
    **Custom toString, equals, and hashCode methods
     */

    //Fields:
    private int id;
    private static int nextId = 1;
    private String value;

    //Constructors:
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }


    // Custom toString, equals, and hashCode methods:
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //Getters and Setters:
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

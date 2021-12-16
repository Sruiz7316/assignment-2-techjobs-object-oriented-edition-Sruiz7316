package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends  JobField{


    public PositionType() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId() && Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }

    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.



    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:

    

}

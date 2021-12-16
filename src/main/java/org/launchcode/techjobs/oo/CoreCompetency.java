package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends  JobField{



    public CoreCompetency() {
        super();
    }

    public CoreCompetency(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return getId() == that.getId();
    }



}

package lab5_optional;

import java.io.Serializable;

public abstract class Item implements Serializable {

    private String name;
    private String location;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getLocation();

    public abstract void setLocation(String location);


}
package org.bridgelabz.Oops;

//@XmlRootElement
public class COrder {
    String name;
    String detail;

    @Override
    public String toString() {
        return "COrder [name=" + name + ", detail=" + detail
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }
}
package fr.utbm.coursemanagement.util;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {

    private String city;
    private String streetName;
    private String postalCode;
    private String streetNumber;

    public Address(){
        city = null;
        streetName = null;
        streetNumber = null;
        postalCode = null;
    }

    public Address(String city, String streetName, String postalCode, String streetNumber) {
        this.city = city;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(streetName, address.streetName) &&
                Objects.equals(postalCode, address.postalCode) &&
                Objects.equals(streetNumber, address.streetNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(city, streetName, postalCode, streetNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}

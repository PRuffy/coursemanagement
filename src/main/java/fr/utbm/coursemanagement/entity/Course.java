package fr.utbm.coursemanagement.entity;

import fr.utbm.coursemanagement.util.Address;
import org.springframework.data.annotation.Id;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;


public class Course implements Serializable {

    @Id
    private String id;
    private Address location;
    private ArrayList<Date> dates;
    private Integer duration;
    private Boolean repetable;
    private Integer numberOfPlace;

    public Course(){
        id = null;
        location = null;
        dates = null;
        duration = null;
        repetable = null;
        numberOfPlace = null;
    }

    public Course(String id, Address location, ArrayList<Date> dates, Integer duration, Boolean repetable, Integer numberOfPlace){
        this.id = id;
        this.location = location;
        this.dates = dates;
        this.duration = duration;
        this.repetable = repetable;
        this.numberOfPlace = numberOfPlace;
    }

    public Course(String id, String city, String  streetName, String postalCode, String streetNumber, ArrayList<Date> dates, Integer duration, Boolean repetable, Integer numberOfPlace){
        this.id = id;
        this.location = new Address(city,streetName,postalCode,streetNumber);
        this.dates = dates;
        this.duration = duration;
        this.repetable = repetable;
        this.numberOfPlace = numberOfPlace;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }

    public ArrayList<Date> getDates() {
        return dates;
    }

    public void setDate(ArrayList<Date> dates) {
        this.dates = dates;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getRepetable() {
        return repetable;
    }

    public void setRepetable(Boolean repetable) {
        this.repetable = repetable;
    }

    public Integer getNumberOfPlace() {
        return numberOfPlace;
    }

    public void setNumberOfPlace(Integer numberOfPlace) {
        this.numberOfPlace = numberOfPlace;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", location=" + location +
                ", dates=" + dates.toString() +
                ", duration=" + duration +
                ", repetable=" + repetable +
                ", numberOfPlace=" + numberOfPlace +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id) &&
                Objects.equals(location, course.location) &&
                Objects.equals(dates, course.dates) &&
                Objects.equals(duration, course.duration) &&
                Objects.equals(repetable, course.repetable) &&
                Objects.equals(numberOfPlace, course.numberOfPlace);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, location, dates, duration, repetable, numberOfPlace);
    }
}

package fr.utbm.coursemanagement.entity;

import fr.utbm.coursemanagement.util.Address;
import fr.utbm.coursemanagement.util.Role;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Role role;
    private String mail;
    private Address address;
    private String phoneNumber;
    private Boolean genre;

    public User() {
        id = null;
        firstName = null;
        lastName = null;
        age = null;
        role = null;
        mail = null;
        address = null;
        phoneNumber = null;
        genre = null;
    }

    public User(String id, String firstName, String lastName, Integer age, Role role, String mail, Address address, String phoneNumber, Boolean genre) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.role = role;
        this.mail = mail;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.genre = genre;
    }

    public User(String id, String firstName, String lastName, Integer age, Role role, String mail,String city, String  streetName, String postalCode, String streetNumber, String phoneNumber, Boolean genre) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.role = role;
        this.mail = mail;
        this.address =  new Address(city,streetName,postalCode,streetNumber);
        this.phoneNumber = phoneNumber;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getGenre() {
        return genre;
    }

    public void setGenre(Boolean genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(age, user.age) &&
                role == user.role &&
                Objects.equals(mail, user.mail) &&
                Objects.equals(address, user.address) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(genre, user.genre);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, age, role, mail, address, phoneNumber, genre);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", role=" + role +
                ", mail='" + mail + '\'' +
                ", address=" + address +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", genre=" + genre +
                '}';
    }
}

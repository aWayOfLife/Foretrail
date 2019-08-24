package com.thetripod.foretrail.Dashboard;

import java.util.Date;
import java.util.List;

public class MissingUsersSecondary {
    private  String entryNo;
    private  Date dob;
    private  String birthCountry;
    private  String hairColour;
    private String eyeColour;
    private  String passportNumber;
    private List<contactDetails> otherId;
    private  String homeAddress;
    private List<contactDetails> contactPersonDetails;
    private  String city;
    private  String state;
    private  String zip;
    private  String country;
    private  String phoneNumber;

    public MissingUsersSecondary(String entryNo, Date dob, String birthCountry, String hairColour, String eyeColour, String passportNumber, List<contactDetails> otherId, String homeAddress, List<contactDetails> contactPersonDetails, String city, String state, String zip, String country, String phoneNumber) {
        this.entryNo = entryNo;
        this.dob = dob;
        this.birthCountry = birthCountry;
        this.hairColour = hairColour;
        this.eyeColour = eyeColour;
        this.passportNumber = passportNumber;
        this.otherId = otherId;
        this.homeAddress = homeAddress;
        this.contactPersonDetails = contactPersonDetails;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "MissingUsersSecondary{" +
                "entryNo='" + entryNo + '\'' +
                ", dob='" + dob + '\'' +
                ", birthCountry='" + birthCountry + '\'' +
                ", hairColour='" + hairColour + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", otherId=" + otherId +
                ", homeAddress='" + homeAddress + '\'' +
                ", contactPersonDetails=" + contactPersonDetails +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getEntryNo() {
        return entryNo;
    }

    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public List<contactDetails> getOtherId() {
        return otherId;
    }

    public void setOtherId(List<contactDetails> otherId) {
        this.otherId = otherId;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public List<contactDetails> getContactPersonDetails() {
        return contactPersonDetails;
    }

    public void setContactPersonDetails(List<contactDetails> contactPersonDetails) {
        this.contactPersonDetails = contactPersonDetails;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class contactDetails{
    private  String name;
    private String number;

    public contactDetails(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
package com.thetripod.foretrail;

public class MissingUsersPrimary {

    private String entryNo;
    private String name;
    private int age;
    private double height;
    private double weight;
    private String photoId;
    private String ethnicity;
    private char gender;
    private String missingLocation;
    private boolean verificationStatus;
    private String verificationPolicaStation;
    private String userReported;

    public MissingUsersPrimary(String entryNo, String name, int age, double height, double weight, String photoId, String ethnicity, char gender, String missingLocation, boolean verificationStatus, String verificationPolicaStation, String userReported, int isoCode) {
        this.entryNo = entryNo;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.photoId = photoId;
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.missingLocation = missingLocation;
        this.verificationStatus = verificationStatus;
        this.verificationPolicaStation = verificationPolicaStation;
        this.userReported = userReported;
        this.isoCode = isoCode;
    }

    @Override
    public String toString() {
        return "MissingUsersPrimary{" +
                "entryNo='" + entryNo + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", photoId='" + photoId + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", gender=" + gender +
                ", missingLocation='" + missingLocation + '\'' +
                ", verificationStatus=" + verificationStatus +
                ", verificationPolicaStation='" + verificationPolicaStation + '\'' +
                ", userReported='" + userReported + '\'' +
                ", isoCode=" + isoCode +
                '}';
    }

    public String getEntryNo() {
        return entryNo;
    }

    public void setEntryNo(String entryNo) {
        this.entryNo = entryNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getMissingLocation() {
        return missingLocation;
    }

    public void setMissingLocation(String missingLocation) {
        this.missingLocation = missingLocation;
    }

    public boolean isVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(boolean verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getVerificationPolicaStation() {
        return verificationPolicaStation;
    }

    public void setVerificationPolicaStation(String verificationPolicaStation) {
        this.verificationPolicaStation = verificationPolicaStation;
    }

    public String getUserReported() {
        return userReported;
    }

    public void setUserReported(String userReported) {
        this.userReported = userReported;
    }

    public int getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(int isoCode) {
        this.isoCode = isoCode;
    }

    private int isoCode;


}

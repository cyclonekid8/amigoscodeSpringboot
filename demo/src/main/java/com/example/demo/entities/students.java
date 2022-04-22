package com.example.demo.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="mockdb")
public class students {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @SequenceGenerator(name="student_sequence",sequenceName="student_sequence",allocationSize=1)
    @Column(name="ID")
    public int id;
    @Column(name="Name")
    private String name;
    @Column(name="Age")
    private Integer age;
    @Column(name="Gender")
    private String gender;
    @Column(name="Hobby")
    private String hobby;
    @Column(name="Religion")
    private String religion;
    @Column(name="Home_Address_1")
    private String homeAddressLine1;
    @Column(name="Home_Address_2")
    private String homeAddressLine2;
    @Column(name="Home_Address_3")
    private String homeAddressLine3;
    @Column(name="Mailing_Address")
    private String mailingAddress;
    @Column(name="Occupation")
    private String occupation;
    @Column(name="Marital_Status")
    private String maritalStatus;

    public students(int id,String name,Integer age,String gender, String religion, String hobby,
                    String homeAddressLine1, String homeAddressLine2, String homeAddressLine3,
                    String mailingAddress, String occupation, String maritalStatus){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.religion=religion;
        this.hobby=hobby;
        this.homeAddressLine1=homeAddressLine1;
        this.homeAddressLine2=homeAddressLine2;
        this.homeAddressLine3=homeAddressLine3;
        this.mailingAddress=mailingAddress;
        this.occupation=occupation;
        this.maritalStatus=maritalStatus;
    }
    public students(){

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getHomeAddressLine1() {
        return homeAddressLine1;
    }

    public void setHomeAddressLine1(String homeAddressLine1) {
        this.homeAddressLine1 = homeAddressLine1;
    }

    public String getHomeAddressLine2() {
        return homeAddressLine2;
    }

    public void setHomeAddressLine2(String homeAddressLine2) {
        this.homeAddressLine2 = homeAddressLine2;
    }

    public String getHomeAddressLine3() {
        return homeAddressLine3;
    }

    public void setHomeAddressLine3(String homeAddressLine3) {
        this.homeAddressLine3 = homeAddressLine3;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobby='" + hobby + '\'' +
                ", religion='" + religion + '\'' +
                ", homeAddressLine1='" + homeAddressLine1 + '\'' +
                ", homeAddressLine2='" + homeAddressLine2 + '\'' +
                ", homeAddressLine3='" + homeAddressLine3 + '\'' +
                ", mailingAddress='" + mailingAddress + '\'' +
                ", occupation='" + occupation + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                '}';
    }
}

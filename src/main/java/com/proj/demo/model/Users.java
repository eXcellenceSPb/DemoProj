package com.proj.demo.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "users", catalog = "vega")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 10)
    private int id;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "second_name")
    private String second_name;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "password")
    private String password;

    @Column(name = "pass_changed", columnDefinition = "enum")
    private String pass_changed;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    private String role;

    @Column(name = "onesignal_id")
    private String onesignal_id;

    @Column(name = "reg_date")
    private Timestamp reg_date;

    @Column(name = "last_active")
    private Timestamp last_active;

    @Column(name = "group", length = 10)
    private Integer group;

    @Column(name = "passportSeries", length = 50)
    private String passportSeries;

    @Column(name = "passportNumber", length = 50)
    private String passportNumber;

    @Column(name = "issued", length = 1000)
    private String issued;

    @Column(name = "issued_code", length = 50)
    private String issued_code;

    @Column(name = "issuedDate")
    private Date issuedDate;

    @Column(name = "birthDate")
    private Date birthDate;

    @Column(name = "birthPlace", length = 50)
    private String birthPlace;

    @Column(name = "region", length = 50)
    private String region;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "street", length = 50)
    private String street;

    @Column(name = "house", length = 50)
    private String house;

    @Column(name = "apartments", length = 50)
    private String apartments;

    @Column(name = "inn", length = 100)
    private String inn;

    @Column(name = "snils", length = 100)
    private String snils;

    @Column(name = "regionFact", length = 50)
    private String regionFact;

    @Column(name = "cityFact", length = 50)
    private String cityFact;

    @Column(name = "houseFact", length = 50)
    private String houseFact;

    @Column(name = "apartmentsFact", length = 50)
    private String apartmentsFact;

    @Column(length = 1)
    private Boolean addrChecker;

    @Column(name = "vk")
    private String vk;

    @Column(name = "telegram", length = 50)
    private String telegram;

    @Column(name = "watsapp", length = 50)
    private String watsapp;

    @Column(name = "viber", length = 50)
    private String viber;

    @Column(name = "skype", length = 50)
    private String skype;

    @Column(name = "instagram", length = 50)
    private String instagram;

    @Column(name = "contact")
    private Boolean contact;

    @Column(name = "avatar", length = 50)
    private String avatar;

    @Column(name = "banner", length = 50)
    private String banner;

    @Column(name = "part", length = 3)
    private Integer part;

    @Column(name = "owner")
    private Boolean owner;

    @Column(name = "password_md5")
    private String password_md5;

    public Users(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPass_changed() {
        return pass_changed;
    }

    public void setPass_changed(String pass_changed) {
        this.pass_changed = pass_changed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOnesignal_id() {
        return onesignal_id;
    }

    public void setOnesignal_id(String onesignal_id) {
        this.onesignal_id = onesignal_id;
    }

    public Timestamp getReg_date() {
        return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }

    public Timestamp getLast_active() {
        return last_active;
    }

    public void setLast_active(Timestamp last_active) {
        this.last_active = last_active;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(String passportSeries) {
        this.passportSeries = passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public String getIssued_code() {
        return issued_code;
    }

    public void setIssued_code(String issued_code) {
        this.issued_code = issued_code;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartments() {
        return apartments;
    }

    public void setApartments(String apartments) {
        this.apartments = apartments;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getRegionFact() {
        return regionFact;
    }

    public void setRegionFact(String regionFact) {
        this.regionFact = regionFact;
    }

    public String getCityFact() {
        return cityFact;
    }

    public void setCityFact(String cityFact) {
        this.cityFact = cityFact;
    }

    public String getHouseFact() {
        return houseFact;
    }

    public void setHouseFact(String houseFact) {
        this.houseFact = houseFact;
    }

    public String getApartmentsFact() {
        return apartmentsFact;
    }

    public void setApartmentsFact(String apartmentsFact) {
        this.apartmentsFact = apartmentsFact;
    }

    public Boolean getAddrChecker() {
        return addrChecker;
    }

    public void setAddrChecker(Boolean addrChecker) {
        this.addrChecker = addrChecker;
    }

    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getWatsapp() {
        return watsapp;
    }

    public void setWatsapp(String watsapp) {
        this.watsapp = watsapp;
    }

    public String getViber() {
        return viber;
    }

    public void setViber(String viber) {
        this.viber = viber;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public Boolean getContact() {
        return contact;
    }

    public void setContact(Boolean contact) {
        this.contact = contact;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }
}

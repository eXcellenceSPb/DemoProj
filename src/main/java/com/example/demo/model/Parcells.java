package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "parcel", catalog = "vega")
public class Parcells {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11)
    private int id;

    @Column(name = "address_snt", length = 100)
    private String address_snt;

    @Column(name = "address_street", length = 100)
    private String address_street;

    @Column(name = "address_house", length = 100)
    private String address_house;

    @Column(name = "survey", length = 1)
    private Boolean survey;

    @Column(name = "id_devices", length = 50)
    private String id_devices;

    @Column(name = "kad_number", length = 20)
    private String kad_number;

    @Column(name = "group", length = 11)
    private Integer group;

    @Column(name = "image", length = 1000)
    private String image;

    @Column(name = "position", length = 50)
    private String position;

    @Column(name = "square", length = 50)
    private String square;

    @Column(name = "contact_id", length = 11)
    private Integer contact_id;

    public Parcells(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress_snt() {
        return address_snt;
    }

    public void setAddress_snt(String address_snt) {
        this.address_snt = address_snt;
    }

    public String getAddress_street() {
        return address_street;
    }

    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }

    public String getAddress_house() {
        return address_house;
    }

    public void setAddress_house(String address_house) {
        this.address_house = address_house;
    }

    public Boolean getSurvey() {
        return survey;
    }

    public void setSurvey(Boolean survey) {
        this.survey = survey;
    }

    public String getId_devices() {
        return id_devices;
    }

    public void setId_devices(String id_devices) {
        this.id_devices = id_devices;
    }

    public String getKad_number() {
        return kad_number;
    }

    public void setKad_number(String kad_number) {
        this.kad_number = kad_number;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }

    public Integer getContact_id() {
        return contact_id;
    }

    public void setContact_id(Integer contact_id) {
        this.contact_id = contact_id;
    }
}

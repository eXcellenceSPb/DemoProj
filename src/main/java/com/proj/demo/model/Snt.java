package com.proj.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "snt", catalog = "vega")
public class Snt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11)
    private Integer id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "price_tarif_1")
    private Float price_tarif_1;

    @Column(name = "price_tarif_2")
    private Float price_tarif_2;

    @Column(name = "price_tarif_3")
    private Float price_tarif_3;

    @Column(name = "price_tarif_4")
    private Float price_tarif_4;

    @Column(name = "address_region", length = 100)
    private String address_region;

    @Column(name = "address_district", length = 100)
    private String address_district;

    @Column(name = "address_locality", length = 100)
    private String address_locality;

    @Column(name = "address_array", length = 100)
    private String address_array;

    @Column(name = "receiver", length = 50)
    private String receiver;

    @Column(name = "inn", length = 50)
    private String inn;

    @Column(name = "kpp", length = 50)
    private String kpp;

    @Column(name = "oktmo", length = 50)
    private String oktmo;

    @Column(name = "account_name", length = 50)
    private String account_name;

    @Column(name = "account_number", length = 50)
    private String account_number;

    @Column(name = "bank_name", length = 50)
    private String bank_name;

    @Column(name = "bik", length = 50)
    private String bik;

    @Column(name = "korr_account", length = 50)
    private String korr_account;

    @Column(name = "requisites_json", length = 50)
    private String requisites_json;

    @Column(name = "connected_types", length = 50)
    private String connected_types;

    public Snt() {}

    public Snt(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice_tarif_1() {
        return price_tarif_1;
    }

    public void setPrice_tarif_1(Float price_tarif_1) {
        this.price_tarif_1 = price_tarif_1;
    }

    public Float getPrice_tarif_2() {
        return price_tarif_2;
    }

    public void setPrice_tarif_2(Float price_tarif_2) {
        this.price_tarif_2 = price_tarif_2;
    }

    public Float getPrice_tarif_3() {
        return price_tarif_3;
    }

    public void setPrice_tarif_3(Float price_tarif_3) {
        this.price_tarif_3 = price_tarif_3;
    }

    public Float getPrice_tarif_4() {
        return price_tarif_4;
    }

    public void setPrice_tarif_4(Float price_tarif_4) {
        this.price_tarif_4 = price_tarif_4;
    }

    public String getAddress_region() {
        return address_region;
    }

    public void setAddress_region(String address_region) {
        this.address_region = address_region;
    }

    public String getAddress_district() {
        return address_district;
    }

    public void setAddress_district(String address_district) {
        this.address_district = address_district;
    }

    public String getAddress_locality() {
        return address_locality;
    }

    public void setAddress_locality(String address_locality) {
        this.address_locality = address_locality;
    }

    public String getAddress_array() {
        return address_array;
    }

    public void setAddress_array(String address_array) {
        this.address_array = address_array;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    public String getKorr_account() {
        return korr_account;
    }

    public void setKorr_account(String korr_account) {
        this.korr_account = korr_account;
    }

    public String getRequisites_json() {
        return requisites_json;
    }

    public void setRequisites_json(String requisites_json) {
        this.requisites_json = requisites_json;
    }

    public String getConnected_types() {
        return connected_types;
    }

    public void setConnected_types(String connected_types) {
        this.connected_types = connected_types;
    }
}
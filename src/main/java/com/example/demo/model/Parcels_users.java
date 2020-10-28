package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "parcels_users", catalog = "vega")
public class Parcels_users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_p_u", length = 11)
    private int id;

    @Column(name = "parcels", length = 11)
    private int parcels;

    public Parcels_users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParcels() {
        return parcels;
    }

    public void setParcels(int parcels) {
        this.parcels = parcels;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    @Column(name = "users", length = 11)
    private int users;
}

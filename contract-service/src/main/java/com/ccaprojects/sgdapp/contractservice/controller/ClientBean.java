package com.ccaprojects.sgdapp.contractservice.controller;

public class ClientBean {

    private Integer idClient;
    private String address;

    private String name;

    public ClientBean() {
    }

    public ClientBean(Integer idClient, String address, String name) {
        this.idClient = idClient;
        this.address = address;
        this.name = name;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.ccaprojects.sgdapp.clientservice.model;


public class Client {

    private Integer idClient;
    private String address;

    public Client(Integer idClient, String address) {
        this.idClient = idClient;
        this.address = address;
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


}

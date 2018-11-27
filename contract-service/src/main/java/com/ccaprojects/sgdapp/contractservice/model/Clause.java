package com.ccaprojects.sgdapp.contractservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Clause {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idClause;
    private Integer idContract;
    private Integer orden;
    private String name;
    private String label;
    private boolean enable;
    private String userCreation;
    private Date dateCreation;
    private String userUpdate;
    private Date dateUpdate;

    public Clause() {
    }

    public Clause(Integer idClause, Integer idContract, Integer orden, String name, String label, boolean enable, String userCreation, Date dateCreation, String userUpdate, Date dateUpdate) {
        this.idClause = idClause;
        this.idContract = idContract;
        this.orden = orden;
        this.name = name;
        this.label = label;
        this.enable = enable;
        this.userCreation = userCreation;
        this.dateCreation = dateCreation;
        this.userUpdate = userUpdate;
        this.dateUpdate = dateUpdate;
    }

    public Integer getIdClause() {
        return idClause;
    }

    public void setIdClause(Integer idClause) {
        this.idClause = idClause;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getUserCreation() {
        return userCreation;
    }

    public void setUserCreation(String userCreation) {
        this.userCreation = userCreation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public String toString() {
        return "Clause{" +
                "idClause=" + idClause +
                ", idContract=" + idContract +
                ", orden=" + orden +
                ", name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", enable=" + enable +
                ", userCreation='" + userCreation + '\'' +
                ", dateCreation=" + dateCreation +
                ", userUpdate='" + userUpdate + '\'' +
                ", dateUpdate=" + dateUpdate +
                '}';
    }
}

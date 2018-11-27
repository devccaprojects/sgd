package com.ccaprojects.sgdapp.contractservice.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idContract;
    private Integer idFinantialEntity;
    private String code;
    private String name;
    private String description;
    private String type;
    private String fileName;
    private boolean enable;
    private String userCreation;
    private Date dateCreation;
    private String userUpdate;
    private Date dateUpdate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contract")
    private Set<DetailsContract> detailsContracts;

    public Contract() {
    }

    public Contract(Integer idContract, Integer idFinantialEntity, String code, String name, String description, String type, String fileName, boolean enable, String userCreation, Date dateCreation, String userUpdate, Date dateUpdate) {
        this.idContract = idContract;
        this.idFinantialEntity = idFinantialEntity;
        this.code = code;
        this.name = name;
        this.description = description;
        this.type = type;
        this.fileName = fileName;
        this.enable = enable;
        this.userCreation = userCreation;
        this.dateCreation = dateCreation;
        this.userUpdate = userUpdate;
        this.dateUpdate = dateUpdate;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public Integer getIdFinantialEntity() {
        return idFinantialEntity;
    }

    public void setIdFinantialEntity(Integer idFinantialEntity) {
        this.idFinantialEntity = idFinantialEntity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
        return "Contract{" +
                "idContract=" + idContract +
                ", idFinantialEntity=" + idFinantialEntity +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", fileName='" + fileName + '\'' +
                ", enable=" + enable +
                ", userCreation='" + userCreation + '\'' +
                ", dateCreation=" + dateCreation +
                ", userUpdate='" + userUpdate + '\'' +
                ", dateUpdate=" + dateUpdate +
                '}';
    }

}

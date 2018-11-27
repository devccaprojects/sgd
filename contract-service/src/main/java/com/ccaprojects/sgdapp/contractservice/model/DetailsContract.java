package com.ccaprojects.sgdapp.contractservice.model;

import javax.persistence.*;

@Entity
public class DetailsContract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDetailsContract;
    private String label;
    private String field;

    @ManyToOne
    private Contract contract;

    public DetailsContract() {
    }

    public DetailsContract(String label, String field, Contract contract) {
        this.label = label;
        this.field = field;
        this.contract = contract;
    }

    public Integer getIdDetailsContract() {
        return idDetailsContract;
    }

    public void setIdDetailsContract(Integer idDetailsContract) {
        this.idDetailsContract = idDetailsContract;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "DetailsContract{" +
                "idDetailsContract=" + idDetailsContract +
                ", label='" + label + '\'' +
                ", field='" + field + '\'' +
                ", contract=" + contract +
                '}';
    }
}

package com.example.demo.model;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;


@Entity
@Table(name = "Patient_Records")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer Recordid;

    public String Diseases;
    public String Perception;
    public String Doctor;
    public String Patient;
    public String Dates;


    public Student() {

    }

    public Student(Integer recordid, String diseases, String perception, String doctor, String patient, String dates) {
        Recordid = recordid;
        Diseases = diseases;
        Perception = perception;
        Doctor = doctor;
        Patient = patient;
        Dates = dates;
    }

    public Integer getRecordid() {
        return Recordid;
    }

    public void setRecordid(Integer recordid) {
        Recordid = recordid;
    }

    public String getDiseases() {
        return Diseases;
    }

    public void setDiseases(String diseases) {
        Diseases = diseases;
    }

    public String getPerception() {
        return Perception;
    }

    public void setPerception(String perception) {
        Perception = perception;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String getPatient() {
        return Patient;
    }

    public void setPatient(String patient) {
        Patient = patient;
    }

    public String getDates() {
        return Dates;
    }

    public void setDates(String dates) {
        Dates = dates;
    }

}
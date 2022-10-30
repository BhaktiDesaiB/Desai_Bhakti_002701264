/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author bhakti
 */
public class Patient 
{
    private int patientId;
    private String patientName;
    private Date patientDateOfbirth;
    private char patientGender;
    private long patientContact;
    private String patientEmail;
    private String patientAddress;
    private String patientCity; 
    private short patientPincode;
    private String patientDoctorName;
    private String patientHospitalName;

    public String getPatientDoctorName() {
        return patientDoctorName;
    }

    public void setPatientDoctorName(String patientDoctorName) {
        this.patientDoctorName = patientDoctorName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getPatientDateOfbirth() {
        return patientDateOfbirth;
    }

    public void setPatientDateOfbirth(Date patientDateOfbirth) {
        this.patientDateOfbirth = patientDateOfbirth;
    }

    public char getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(char patientGender) {
        this.patientGender = patientGender;
    }

    public long getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(long patientContact) {
        this.patientContact = patientContact;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public short getPatientPincode() {
        return patientPincode;
    }

    public void setPatientPincode(short patientPincode) {
        this.patientPincode = patientPincode;
    }

    public String getPatientHospitalName() {
        return patientHospitalName;
    }

    public void setPatientHospitalName(String patientHospitalName) {
        this.patientHospitalName = patientHospitalName;
    }
 
    
}

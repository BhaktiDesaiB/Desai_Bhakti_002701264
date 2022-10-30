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
    //private int patientId;
    private String patientName;
    private  String patientDateOfbirth;
    private String patientGender;
    private long patientContact;
    private String patientEmail;
    private String patientAddress;
    private String patientCity; 
    private int patientPincode;
    private String patientDoctorName;
    private String patientHospitalName;
    
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
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

    public int getPatientPincode() {
        return patientPincode;
    }

    public void setPatientPincode(int patientPincode) {
        this.patientPincode = patientPincode;
    }
    
    public String getPatientDoctorName() {
        return patientDoctorName;
    }

    public void setPatientDoctorName(String patientDoctorName) {
        this.patientDoctorName = patientDoctorName;
    }

    public String getPatientHospitalName() {
        return patientHospitalName;
    }

    public void setPatientHospitalName(String patientHospitalName) {
        this.patientHospitalName = patientHospitalName;
    }

    public String getPatientDateOfbirth() {
        return patientDateOfbirth;
    }

    public void setPatientDateOfbirth(String patientDateOfbirth) {
        this.patientDateOfbirth = patientDateOfbirth;
    }
}

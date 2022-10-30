/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bhakti
 */
public class Doctor {
    //private int doctorId;
    private String doctorName;
    private String doctorAddress;
    private int doctorPincode;
    private String doctorCity; 
    private String doctorCommunity;
    private long doctorContact;
    private String doctorEmail;
    
    private String userName;
    private String password;

    public int getDoctorPincode() {
        return doctorPincode;
    }

    public void setDoctorPincode(int doctorPincode) {
        this.doctorPincode = doctorPincode;
    }

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

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getDoctorCity() {
        return doctorCity;
    }

    public void setDoctorCity(String doctorCity) {
        this.doctorCity = doctorCity;
    }

    public String getDoctorCommunity() {
        return doctorCommunity;
    }

    public void setDoctorCommunity(String doctorCommunity) {
        this.doctorCommunity = doctorCommunity;
    }

    public long getDoctorContact() {
        return doctorContact;
    }

    public void setDoctorContact(long doctorContact) {
        this.doctorContact = doctorContact;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }
    
    
}

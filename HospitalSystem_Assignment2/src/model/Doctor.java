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
    private int doctorId;
    private String doctorName;
    private String doctorAddress;
    private short doctorPincode;
    private String doctorCity; 
    private String doctorCommunity;
    private long doctorContact;
    private String doctorEmail;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
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

    public short getDoctorPincode() {
        return doctorPincode;
    }

    public void setDoctorPincode(short doctorPincode) {
        this.doctorPincode = doctorPincode;
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

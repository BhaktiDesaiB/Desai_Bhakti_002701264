/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bhakti
 */
public class Community 
{
    private int communityId;
    private String communityName;
    private String communityNearbyArea;
    private String communityHospitalName;
    private long communityEmergencyContact;
    private short communityPincode;
    private String communityCity; 

    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityNearbyArea() {
        return communityNearbyArea;
    }

    public void setCommunityNearbyArea(String communityNearbyArea) {
        this.communityNearbyArea = communityNearbyArea;
    }

    public String getCommunityHospitalName() {
        return communityHospitalName;
    }

    public void setCommunityHospitalName(String communityHospitalName) {
        this.communityHospitalName = communityHospitalName;
    }

    public long getCommunityEmergencyContact() {
        return communityEmergencyContact;
    }

    public void setCommunityEmergencyContact(long communityEmergencyContact) {
        this.communityEmergencyContact = communityEmergencyContact;
    }

    public short getCommunityPincode() {
        return communityPincode;
    }

    public void setCommunityPincode(short communityPincode) {
        this.communityPincode = communityPincode;
    }

    public String getCommunityCity() {
        return communityCity;
    }

    public void setCommunityCity(String communityCity) {
        this.communityCity = communityCity;
    }
    
}

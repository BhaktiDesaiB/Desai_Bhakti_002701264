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
    //private int communityId;
    private String communityName;
    private String communityNearby;
    private String communityHospitalName;
    private long communityContact;
    private int communityPincode;
    private String communityCity; 
    
    private String communityUserName;
    private String communityPassword;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getCommunityNearby() {
        return communityNearby;
    }

    public void setCommunityNearby(String communityNearby) {
        this.communityNearby = communityNearby;
    }

    public String getCommunityHospitalName() {
        return communityHospitalName;
    }

    public void setCommunityHospitalName(String communityHospitalName) {
        this.communityHospitalName = communityHospitalName;
    }

    public long getCommunityContact() {
        return communityContact;
    }

    public void setCommunityContact(long communityContact) {
        this.communityContact = communityContact;
    }

    public int getCommunityPincode() {
        return communityPincode;
    }

    public void setCommunityPincode(int communityPincode) {
        this.communityPincode = communityPincode;
    }

    public String getCommunityCity() {
        return communityCity;
    }

    public void setCommunityCity(String communityCity) {
        this.communityCity = communityCity;
    }

    public String getCommunityUserName() {
        return communityUserName;
    }

    public void setCommunityUserName(String communityUserName) {
        this.communityUserName = communityUserName;
    }

    public String getCommunityPassword() {
        return communityPassword;
    }

    public void setCommunityPassword(String communityPassword) {
        this.communityPassword = communityPassword;
    }
   
}

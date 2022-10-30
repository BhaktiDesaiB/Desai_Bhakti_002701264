/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bhakti
 */
public class City
{
    private int cityId;
    private String cityName;
    private long cityPincode;
    private String cityNearby;
    private String cityCommunity;
    private String cityHospital;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public long getCityPincode() {
        return cityPincode;
    }

    public void setCityPincode(long cityPincode) {
        this.cityPincode = cityPincode;
    }

    public String getCityNearby() {
        return cityNearby;
    }

    public void setCityNearby(String cityNearby) {
        this.cityNearby = cityNearby;
    }

    public String getCityCommunity() 
    {
        return cityCommunity;
    }

    public void setCityCommunity(String cityCommunity) 
    {
        this.cityCommunity = cityCommunity;
    }

    public String getCityHospital() 
    {
        return cityHospital;
    }

    public void setCityHospital(String cityHospital) 
    {
        this.cityHospital = cityHospital;
    }
    
}

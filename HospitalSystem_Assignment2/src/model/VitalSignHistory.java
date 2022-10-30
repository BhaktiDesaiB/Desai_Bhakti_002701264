/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bhakti
 */
public class VitalSignHistory {
     private ArrayList<VitalSign> vitalHistory;
    
    public VitalSignHistory(){
        
        this.vitalHistory = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalHistory() {
        return vitalHistory;
    }

    public void setVitalHistory(ArrayList<VitalSign> vitalHistory) {
        this.vitalHistory = vitalHistory;
    }
        
    public VitalSign addNewVitals(){
        VitalSign newVital = new VitalSign();
        vitalHistory.add(newVital);
        return newVital;
    }
    public void deleteVitals(VitalSign vs){
        vitalHistory.remove(vs);
    }

    
}

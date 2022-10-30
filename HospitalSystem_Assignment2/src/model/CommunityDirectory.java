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
public class CommunityDirectory 
{
    private ArrayList<Community> communityDirectory;
    
    public CommunityDirectory()
    {
        this.communityDirectory = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    public Community addNewCommunity()
    {
        Community newCommunity = new Community();
        communityDirectory.add(newCommunity);
        return newCommunity;
    }
    
}

package com.elevator.system.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Region {
    @Id
    private String RegionID;
    private String RegionName;

    public Region(String regionID, String regionName) {
        RegionID = regionID;
        RegionName = regionName;
    }

    public Region() {
    }

    public String getRegionID() {
        return RegionID;
    }

    public void setRegionID(String regionID) {
        RegionID = regionID;
    }

    public String getRegionName() {
        return RegionName;
    }

    public void setRegionName(String regionName) {
        RegionName = regionName;
    }
}

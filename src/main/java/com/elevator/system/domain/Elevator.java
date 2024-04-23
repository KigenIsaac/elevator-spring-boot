package com.elevator.system.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Elevator {
    @Id
    private String ElevatorId;
    private String Location;
    private String Status;
    private String RegionId;


    public Elevator(String elevatorId, String location, String status, String regionId) {
        ElevatorId = elevatorId;
        Location = location;
        Status = status;
        RegionId = regionId;
    }

    public Elevator() {
    }

    public String getElevatorId() {
        return ElevatorId;
    }

    public void setElevatorId(String elevatorId) {
        ElevatorId = elevatorId;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRegionId() {
        return RegionId;
    }

    public void setRegionId(String regionId) {
        RegionId = regionId;
    }
}

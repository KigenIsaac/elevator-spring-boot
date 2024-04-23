package com.elevator.system.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Incident {
    @Id
    private String IncidentId;
    private String ElevatorId, IncidentDate, Description;

    public Incident(String incidentId, String elevatorId, String incidentDate, String description) {
        IncidentId = incidentId;
        ElevatorId = elevatorId;
        IncidentDate = incidentDate;
        Description = description;
    }

    public Incident() {
    }

    public String getIncidentId() {
        return IncidentId;
    }

    public void setIncidentId(String incidentId) {
        IncidentId = incidentId;
    }

    public String getElevatorId() {
        return ElevatorId;
    }

    public void setElevatorId(String elevatorId) {
        ElevatorId = elevatorId;
    }

    public String getIncidentDate() {
        return IncidentDate;
    }

    public void setIncidentDate(String incidentDate) {
        IncidentDate = incidentDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

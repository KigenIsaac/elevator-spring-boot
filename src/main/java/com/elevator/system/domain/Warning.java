package com.elevator.system.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Warning {
    @Id
    private String WarningId;
    private String ElevatorID, WarningDate, Message, ResolutionStatus;

    public Warning(String warningId, String elevatorID, String warningDate, String message, String resolutionStatus) {
        WarningId = warningId;
        ElevatorID = elevatorID;
        WarningDate = warningDate;
        Message = message;
        ResolutionStatus = resolutionStatus;
    }

    public Warning() {
    }

    public String getWarningId() {
        return WarningId;
    }

    public void setWarningId(String warningId) {
        WarningId = warningId;
    }

    public String getElevatorID() {
        return ElevatorID;
    }

    public void setElevatorID(String elevatorID) {
        ElevatorID = elevatorID;
    }

    public String getWarningDate() {
        return WarningDate;
    }

    public void setWarningDate(String warningDate) {
        WarningDate = warningDate;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getResolutionStatus() {
        return ResolutionStatus;
    }

    public void setResolutionStatus(String resolutionStatus) {
        ResolutionStatus = resolutionStatus;
    }
}

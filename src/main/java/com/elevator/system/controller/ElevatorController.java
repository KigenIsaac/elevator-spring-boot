package com.elevator.system.controller;

import com.elevator.system.domain.Elevator;
import com.elevator.system.service.ElevatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ElevatorController {
    @Autowired
    private ElevatorService elevatorService;
    @RequestMapping("/api/elevators")
    public List<Elevator> getElevators(){
        return elevatorService.getAllElevators();
    }
    @PostMapping("/api/elevator/{id}")
    public Elevator getElevatorById(String id){
        return elevatorService.getElevatorById(id);
    }
}

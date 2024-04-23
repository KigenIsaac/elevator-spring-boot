package com.elevator.system.service;

import com.elevator.system.domain.Elevator;
import com.elevator.system.repository.ElevatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ElevatorService {
    @Autowired
    private ElevatorRepository elevatorRepository;

    public List<Elevator> getAllElevators(){
        List<Elevator> data = new ArrayList<>();
        elevatorRepository.findAll().forEach(data:: add);
        return data;
    }

    public Elevator getElevatorById(String id){
        List<Elevator> data = new ArrayList<>();
        elevatorRepository.findAll().forEach(data:: add);
        return data.stream().filter(elevator -> elevator.getElevatorId().equals(id)).findFirst().get();
    }
}

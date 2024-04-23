package com.elevator.system.service;

import com.elevator.system.domain.Incident;
import com.elevator.system.domain.Warning;
import com.elevator.system.repository.WarningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarningService {
    @Autowired
    private WarningRepository warningRepository;

    public List<Warning> getIncidents(){
        List<Warning> data = new ArrayList<>();
        warningRepository.findAll().forEach(data::add);
        return data;
    }
    public Warning getIncident(String id){
        List<Warning> data = new ArrayList<>();
        warningRepository.findAll().forEach(data::add);
        return data.stream().filter(incident -> incident.getWarningId().equals(id)).findFirst().get();
    }
}

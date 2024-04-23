package com.elevator.system.service;

import com.elevator.system.domain.Region;
import com.elevator.system.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getAllRegions(){
        List<Region> data = new ArrayList<>();
        regionRepository.findAll().forEach(data::add);
        return data;

    }
    public Region getRegion(String id){
        List<Region> data = new ArrayList<>();
        regionRepository.findAll().forEach(data::add);
        return data.stream().filter(region -> region.getRegionID().equals(id)).findFirst().get();
    }
}

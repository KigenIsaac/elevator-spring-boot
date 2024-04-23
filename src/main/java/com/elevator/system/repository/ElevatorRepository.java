package com.elevator.system.repository;

import com.elevator.system.domain.Elevator;
import org.springframework.data.repository.CrudRepository;

public interface ElevatorRepository extends CrudRepository<Elevator, String> {

}

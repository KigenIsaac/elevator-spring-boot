package com.elevator.system.repository;

import com.elevator.system.domain.Incident;
import org.springframework.data.repository.CrudRepository;

public interface IncidentRepository extends CrudRepository<Incident, String> {
}

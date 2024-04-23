package com.elevator.system.repository;
import com.elevator.system.domain.Warning;
import org.springframework.data.repository.CrudRepository;

public interface WarningRepository extends CrudRepository<Warning, String> {

}

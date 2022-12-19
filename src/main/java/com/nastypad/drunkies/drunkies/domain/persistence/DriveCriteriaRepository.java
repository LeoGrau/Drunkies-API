package com.nastypad.drunkies.drunkies.domain.persistence;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveCriteria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DriveCriteriaRepository extends JpaRepository<DriveCriteria, Long> {
    List<DriveCriteria> findAll();
    Optional<DriveCriteria> findByDriveCriteriaId(Long driveCriteriaId);

}

package com.nastypad.drunkies.drunkies.domain.service;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveCriteria;

import java.util.List;

public interface DriveCriteriaService {

    List<DriveCriteria> getAll();
    DriveCriteria getByDriverCriteriaId(Long driveCriteriaId);
    DriveCriteria create(DriveCriteria newDriveCriteria);

}

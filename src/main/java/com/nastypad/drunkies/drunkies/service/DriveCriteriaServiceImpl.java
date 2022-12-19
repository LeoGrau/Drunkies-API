package com.nastypad.drunkies.drunkies.service;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveCriteria;
import com.nastypad.drunkies.drunkies.domain.persistence.DriveCriteriaRepository;
import com.nastypad.drunkies.drunkies.domain.service.DriveCriteriaService;
import com.nastypad.drunkies.shared.exception.ResourceNotFoundException;
import com.nastypad.drunkies.shared.exception.ResourceValidationException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DriveCriteriaServiceImpl implements DriveCriteriaService {

    private final String ENTITY;
    private final DriveCriteriaRepository driveCriteriaRepository;
    private final Validator validator;

    public DriveCriteriaServiceImpl(DriveCriteriaRepository driveCriteriaRepository, Validator validator) {
        this.driveCriteriaRepository = driveCriteriaRepository;
        this.validator = validator;
        this.ENTITY = "DriveCriteria";
    }

    @Override
    public List<DriveCriteria> getAll() {
        return driveCriteriaRepository.findAll();
    }

    @Override
    public DriveCriteria getByDriverCriteriaId(Long driveCriteriaId) {
        return driveCriteriaRepository.findByDriveCriteriaId(driveCriteriaId).orElseThrow(() -> new ResourceNotFoundException("This driver criteria does not exist."));
    }

    @Override
    public DriveCriteria create(DriveCriteria newDriveCriteria) {
        Set<ConstraintViolation<DriveCriteria>> violations = validator.validate(newDriveCriteria);
        if(!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);
        return driveCriteriaRepository.save(newDriveCriteria);

    }
}

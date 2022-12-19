package com.nastypad.drunkies.drunkies.service;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveSkill;
import com.nastypad.drunkies.drunkies.domain.persistence.DriveSkillRepository;
import com.nastypad.drunkies.drunkies.domain.service.DriveSkillService;
import com.nastypad.drunkies.shared.exception.ResourceNotFoundException;
import com.nastypad.drunkies.shared.exception.ResourceValidationException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class DriveSkillServiceImpl implements DriveSkillService {

    private final String ENTITY;
    private final Validator validator;
    private final DriveSkillRepository driveSkillRepository;

    public DriveSkillServiceImpl(Validator validator, DriveSkillRepository driveSkillRepository) {
        this.validator = validator;
        ENTITY = "DriveSkill";
        this.driveSkillRepository = driveSkillRepository;
    }

    @Override
    public List<DriveSkill> getAll() {
        return driveSkillRepository.findAll();
    }

    @Override
    public DriveSkill getByDriveSkillId(Long driveSkillId) {
        return driveSkillRepository.findByDriveSkillId(driveSkillId).orElseThrow(() -> new ResourceNotFoundException("This drive skill does not exist."));
    }

    @Override
    public DriveSkill create(DriveSkill driveSkill) {

        Set<ConstraintViolation<DriveSkill>> violations = validator.validate(driveSkill);
        if(!violations.isEmpty())
            throw new ResourceValidationException(ENTITY, violations);
        return driveSkillRepository.save(driveSkill);
    }
}

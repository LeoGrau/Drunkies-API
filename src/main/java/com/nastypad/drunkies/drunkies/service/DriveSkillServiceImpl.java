package com.nastypad.drunkies.drunkies.service;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveSkill;
import com.nastypad.drunkies.drunkies.domain.persistence.DriveSkillRepository;
import com.nastypad.drunkies.drunkies.domain.service.DriveSkillService;
import com.nastypad.drunkies.shared.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriveSkillServiceImpl implements DriveSkillService {

    private final DriveSkillRepository driveSkillRepository;

    public DriveSkillServiceImpl(DriveSkillRepository driveSkillRepository) {
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
}

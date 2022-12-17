package com.nastypad.drunkies.drunkies.domain.service;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveSkill;

import java.util.List;

public interface DriveSkillService {
    List<DriveSkill> getAll();
    DriveSkill getByDriveSkillId(Long driveSkillId);
}
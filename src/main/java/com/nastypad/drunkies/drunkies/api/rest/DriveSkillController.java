package com.nastypad.drunkies.drunkies.api.rest;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveSkill;
import com.nastypad.drunkies.drunkies.domain.service.DriveCriteriaService;
import com.nastypad.drunkies.drunkies.domain.service.DriveSkillService;
import com.nastypad.drunkies.drunkies.mapping.mappers.DriveSkillMapper;
import com.nastypad.drunkies.drunkies.resource.create.CreateDriveSkillResource;
import com.nastypad.drunkies.drunkies.resource.show.DriveSkillResource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/v1/drive-skills", produces = "application/json")
public class DriveSkillController {
    private final DriveCriteriaService driveCriteriaService;
    private final DriveSkillService driveSkillService;
    private final DriveSkillMapper driveSkillMapper;

    public DriveSkillController(DriveCriteriaService driveCriteriaService, DriveSkillService driveSkillService, DriveSkillMapper driveSkillMapper) {
        this.driveCriteriaService = driveCriteriaService;
        this.driveSkillService = driveSkillService;
        this.driveSkillMapper = driveSkillMapper;
    }

    @GetMapping
    public Page<DriveSkillResource> getAll(Pageable pageable) {
        return driveSkillMapper.toListPageResource(driveSkillService.getAll(), pageable);
    }

//    @PostMapping
//    public DriveSkillResource createDriveSkill(@RequestBody DriveSkillResource driveSkillResource) {
//        //DriveSkill driveSkillMapped = driveSkillMapper.toModel(driveSkillResource);
//        return driveSkillMapper.toResource(driveSkillService.create(driveSkillMapper.toModel(driveSkillResource)));
//    }

    @PostMapping("{driverCriteriaId}")
    public DriveSkillResource createDriveSkillWithSkillCriteriaIdOnUrl(@PathVariable Long driverCriteriaId, @RequestBody CreateDriveSkillResource driveSkillResource) {
        DriveSkill newDriveSkill = driveSkillMapper.toModel(driveSkillResource);
        newDriveSkill.setDriveCriteria(driveCriteriaService.getByDriverCriteriaId(driverCriteriaId));
        return driveSkillMapper.toResource(driveSkillService.create(newDriveSkill));
    }

}

package com.nastypad.drunkies.drunkies.api.rest;

import com.nastypad.drunkies.drunkies.domain.service.DriveSkillService;
import com.nastypad.drunkies.drunkies.mapping.mappers.DriveSkillMapper;
import com.nastypad.drunkies.drunkies.resource.show.DriveSkillResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1/drive-skills", produces = "application/json")
public class DriveSkillController {
    private final DriveSkillService driveSkillService;
    private final DriveSkillMapper driveSkillMapper;

    public DriveSkillController(DriveSkillService driveSkillService, DriveSkillMapper driveSkillMapper) {
        this.driveSkillService = driveSkillService;
        this.driveSkillMapper = driveSkillMapper;
    }

    @GetMapping
    public Page<DriveSkillResource> getAll(Pageable pageable) {
        return driveSkillMapper.toListPageResource(driveSkillService.getAll(), pageable);
    }
}

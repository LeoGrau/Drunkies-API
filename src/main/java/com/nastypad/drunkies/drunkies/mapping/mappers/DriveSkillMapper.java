package com.nastypad.drunkies.drunkies.mapping.mappers;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveSkill;
import com.nastypad.drunkies.drunkies.resource.show.DriveSkillResource;
import com.nastypad.drunkies.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class DriveSkillMapper implements Serializable {

    @Autowired
    EnhancedModelMapper enhancedModelMapper;
    public DriveSkillResource toResource(DriveSkill driveSkillModel) {
        return enhancedModelMapper.map(driveSkillModel, DriveSkillResource.class);
    }

    public Page<DriveSkillResource> toListPageResource(List<DriveSkill> driveSkillModels, Pageable pageable) {
        return new PageImpl<>(enhancedModelMapper.mapList(driveSkillModels, DriveSkillResource.class), pageable, driveSkillModels.size());
    }
}

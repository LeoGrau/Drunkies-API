package com.nastypad.drunkies.drunkies.mapping.mappers;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriverProfile;
import com.nastypad.drunkies.drunkies.resource.show.DriverProfileResource;
import com.nastypad.drunkies.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.sql.Driver;
import java.util.Collection;
import java.util.List;

public class DriverProfileMapper implements Serializable {

    @Autowired
    EnhancedModelMapper enhancedModelMapper;

    public DriverProfileResource toResource(DriverProfile driveProfileModel) {
        return enhancedModelMapper.map(driveProfileModel, DriverProfileResource.class);
    }

    public Page<DriverProfileResource> toListPageResource(List<DriverProfile> driveProfilesModel, Pageable pageable) {
        return new PageImpl<>(enhancedModelMapper.mapList(driveProfilesModel, DriverProfileResource.class), pageable, driveProfilesModel.size());
    }

    public Collection<DriverProfileResource> toListCollectionResource(List<DriverProfile> driveProfilesModel) {
        return enhancedModelMapper.mapList(driveProfilesModel, DriverProfileResource.class);
    }

}

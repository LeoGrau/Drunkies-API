package com.nastypad.drunkies.drunkies.mapping.mappers;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveCriteria;
import com.nastypad.drunkies.drunkies.resource.show.DriveCriteriaResource;
import com.nastypad.drunkies.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class DriveCriteriaMapper implements Serializable {
    @Autowired
    EnhancedModelMapper enhancedModelMapper;

    public DriveCriteriaResource toResource(DriveCriteria driveCriteriaModel) {
        return enhancedModelMapper.map(driveCriteriaModel, DriveCriteriaResource.class);
    }

    public Page<DriveCriteriaResource> toListPageResource(List<DriveCriteria> driveCriteriaList, Pageable pageable) {
        return new PageImpl<>(enhancedModelMapper.mapList(driveCriteriaList, DriveCriteriaResource.class), pageable, driveCriteriaList.size());
    }

    public Collection<DriveCriteriaResource> toListCollectionResource(List<DriveCriteria> driveCriteriaList) {
        return enhancedModelMapper.mapList(driveCriteriaList, DriveCriteriaResource.class);
    }

}

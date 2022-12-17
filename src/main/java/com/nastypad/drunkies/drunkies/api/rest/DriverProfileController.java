package com.nastypad.drunkies.drunkies.api.rest;

import com.nastypad.drunkies.drunkies.domain.service.DriverProfileService;
import com.nastypad.drunkies.drunkies.mapping.mappers.DriverProfileMapper;
import com.nastypad.drunkies.drunkies.resource.show.DriverProfileResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/driver-profile", produces = "application/json")
public class DriverProfileController {
    private final DriverProfileService driverProfileService;
    private final DriverProfileMapper driverProfileMapper;

    public DriverProfileController(DriverProfileService driverProfileService, DriverProfileMapper driverProfileMapper) {
        this.driverProfileService = driverProfileService;
        this.driverProfileMapper = driverProfileMapper;
    }

    @GetMapping
    public Page<DriverProfileResource> getAllDriverProfileResource(Pageable pageable) {
        return driverProfileMapper.toListPageResource(driverProfileService.getAll(), pageable);
    }

    //@GetMapping("{id}")
}

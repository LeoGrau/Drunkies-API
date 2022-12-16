package com.nastypad.drunkies.drunkies.domain.service;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriverProfile;

import java.util.List;

public interface DriverProfileService {
    List<DriverProfile> getAll();
    DriverProfile getByDriversId(Long driverId);
}

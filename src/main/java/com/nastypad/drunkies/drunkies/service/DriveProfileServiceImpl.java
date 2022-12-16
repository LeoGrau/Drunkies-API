package com.nastypad.drunkies.drunkies.service;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriverProfile;
import com.nastypad.drunkies.drunkies.domain.persistence.DriverProfileRepository;
import com.nastypad.drunkies.drunkies.domain.service.DriverProfileService;
import com.nastypad.drunkies.shared.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriveProfileServiceImpl implements DriverProfileService {

    private final DriverProfileRepository driveProfileRepository;

    public DriveProfileServiceImpl(DriverProfileRepository driveProfileRepository) {
        this.driveProfileRepository = driveProfileRepository;
    }

    @Override
    public List<DriverProfile> getAll() {
        return driveProfileRepository.findAll();
    }

    @Override
    public DriverProfile getByDriversId(Long driverId) {
        return driveProfileRepository.findByDriverId(driverId).orElseThrow(() -> new ResourceNotFoundException("This driver does not exist."));
    }
}

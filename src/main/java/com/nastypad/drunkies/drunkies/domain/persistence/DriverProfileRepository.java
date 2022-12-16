package com.nastypad.drunkies.drunkies.domain.persistence;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriverProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverProfileRepository extends JpaRepository<DriverProfile, Long> {
    List<DriverProfile> findAll();
    Optional<DriverProfile> findByDriverId(Long driverId);

}

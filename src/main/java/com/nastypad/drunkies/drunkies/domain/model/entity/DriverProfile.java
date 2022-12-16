package com.nastypad.drunkies.drunkies.domain.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "driver_profiles")
@Getter
@Setter
public class DriverProfile {
    @Id
    Long driverId;
    String driverName;
    String photoUrl;

    public DriverProfile() {

    }
    public DriverProfile(long driverId, String driverName, String photoUrl) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.photoUrl = photoUrl;
    }

}

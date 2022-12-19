package com.nastypad.drunkies.drunkies.domain.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

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

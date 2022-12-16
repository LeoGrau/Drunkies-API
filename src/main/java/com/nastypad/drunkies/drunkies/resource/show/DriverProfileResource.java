package com.nastypad.drunkies.drunkies.resource.show;


import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class DriverProfileResource {
    private long driverId;
    private String driverName;
}

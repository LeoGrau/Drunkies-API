package com.nastypad.drunkies.drunkies.mapping;

import com.nastypad.drunkies.drunkies.mapping.mappers.DriverProfileMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("learningMappingConfiguration")
public class MappingConfiguration {

    @Bean
    public DriverProfileMapper driveProfileMapper() {
        return new DriverProfileMapper();
    }

}

package com.nastypad.drunkies.drunkies.domain.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "drive_criterias")
public class DriveCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long driveCriteriaId;
    String driveCriteriaName;

    @OneToMany(mappedBy = "driveCriteria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<DriveSkill> driveSkills;

    public DriveCriteria() {
    }

    public DriveCriteria(Long driveCriteriaId, String driveCriteriaName) {
        this.driveCriteriaId = driveCriteriaId;
        this.driveCriteriaName = driveCriteriaName;
    }
}

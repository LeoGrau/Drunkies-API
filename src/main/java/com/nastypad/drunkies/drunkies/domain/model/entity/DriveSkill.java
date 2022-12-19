package com.nastypad.drunkies.drunkies.domain.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "drive_skills")
public class DriveSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driveSkillId;
    private String driveSkillName;

    @ManyToOne
    @JoinColumn(name = "drive_criteria_id")
    DriveCriteria driveCriteria;
}

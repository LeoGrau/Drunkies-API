package com.nastypad.drunkies.drunkies.domain.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "drive_skill")
public class DriveSkill {

    @Id
    private Long driveSkillId;
    private String driveSkillName;
}

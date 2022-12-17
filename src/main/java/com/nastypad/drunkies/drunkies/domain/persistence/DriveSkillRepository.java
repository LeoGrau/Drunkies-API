package com.nastypad.drunkies.drunkies.domain.persistence;

import com.nastypad.drunkies.drunkies.domain.model.entity.DriveSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriveSkillRepository extends JpaRepository<DriveSkill, Long> {
    List<DriveSkill> findAll();
    Optional<DriveSkill> findByDriveSkillId(Long driveSkillId);
}

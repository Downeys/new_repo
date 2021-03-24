package com.wristbandcollection.Version0001.dao;

import com.wristbandcollection.Version0001.models.RecordingStudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordingStudioDao extends JpaRepository<RecordingStudio, Integer> {
}

package com.wristbandcollection.Version0001.dao;

import com.wristbandcollection.Version0001.models.Hometown;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HometownDao extends JpaRepository<Hometown, Integer> {
}

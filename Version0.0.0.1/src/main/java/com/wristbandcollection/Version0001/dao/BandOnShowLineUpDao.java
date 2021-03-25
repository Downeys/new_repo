package com.wristbandcollection.Version0001.dao;

import com.wristbandcollection.Version0001.models.BandOnShowLineUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandOnShowLineUpDao extends JpaRepository<BandOnShowLineUp, Integer> {
}

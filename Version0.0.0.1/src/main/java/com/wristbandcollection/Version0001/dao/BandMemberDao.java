package com.wristbandcollection.Version0001.dao;

import com.wristbandcollection.Version0001.models.BandMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BandMemberDao extends JpaRepository<BandMember, Integer> {
}

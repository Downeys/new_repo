package com.wristbandcollection.Version0001.dao;

import com.wristbandcollection.Version0001.models.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueDao extends JpaRepository<Venue, Integer> {
}

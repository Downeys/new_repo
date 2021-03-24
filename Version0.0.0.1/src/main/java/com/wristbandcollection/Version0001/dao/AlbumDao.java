package com.wristbandcollection.Version0001.dao;

import com.wristbandcollection.Version0001.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumDao extends JpaRepository<Album, Integer> {
}

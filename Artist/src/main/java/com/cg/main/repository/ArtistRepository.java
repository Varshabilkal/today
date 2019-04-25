package com.cg.main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cg.main.entities.Artist;
public interface ArtistRepository extends JpaRepository<Artist,Integer>{
	@Transactional
	@Modifying
	@Query("UPDATE Artist m SET m.artist_name=:artist_name,m.type=:type WHERE m.artist_id=:artist_id")
	int updateArtist(int artist_id, String artist_name, String type);

}

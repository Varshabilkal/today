package com.cg.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.main.entities.Composer;
import com.cg.main.entities.Song;

public interface SongRepository extends JpaRepository<Song,Integer>{

}

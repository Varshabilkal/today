package com.cg.main.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.main.entities.Artist;
import com.cg.main.entities.Composer;
import com.cg.main.entities.Composer_song;
import com.cg.main.repository.ArtistRepository;
import com.cg.main.repository.ComposerRepository;
import com.cg.main.repository.ComposerSongRepository;

@Service
public class ArtistService {
	@Autowired
	private ArtistRepository artistRepository;

	
	  public Artist addArtist(Artist artist) {
	  
	  return artistRepository.save(artist); }
	  
	  public Artist getArtist(int artist_id) { // if
	   return artistRepository.getOne(artist_id);
	 // else return null;
	   }
	  
	/*
	 * private boolean ValidateArtist_id(int artist_id) { Artist artist
	 * =artistRepository.findOne(artist_id); if (artist != null) return true; else
	 * return false; }
	 * 
	 * public Artist createArtist(Artist artist) { return
	 * artistRepository.save(artist); }
	 * 
	 * public List<Artist> getAllArtist() { return artistRepository.findAll(); }
	 * 
	 * public Artist updateArtist(int artist_id, Artist artist) { // TODO return
	 * artistRepository.save(artist); }
	 */
	  
	  }
	 


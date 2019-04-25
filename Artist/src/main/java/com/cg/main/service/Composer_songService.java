package com.cg.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.main.entities.Composer;
import com.cg.main.entities.Composer_song;
import com.cg.main.repository.ComposerRepository;
import com.cg.main.repository.ComposerSongRepository;

@Service
public class Composer_songService {
	@Autowired
	private ComposerSongRepository composerSongRepository;

	public Composer_song addComposer_song(Composer_song composersong) { 
		  int composer_id =composersong.getComposer_id();
	  
	  return composerSongRepository.save(composersong); }
	  
	  public List<Composer_song> getAllComposer_song() {
	  
	  return composerSongRepository.findAll(); }
	  
	  public ComposerSongRepository getComposerRepository() { 
		  return composerSongRepository; }
	  
	  public void setComposerRepository(ComposerRepository composerRepository) {
	 this.composerSongRepository = composerSongRepository; }
	 
	  public Composer_song updateComposer_song(int composer_id, Composer_song composersong) {
	  
	  return composerSongRepository.save(composersong); }
	 
}

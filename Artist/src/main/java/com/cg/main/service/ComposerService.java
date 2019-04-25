package com.cg.main.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.main.entities.Artist;
import com.cg.main.entities.Artist_Song;
import com.cg.main.entities.Composer;
import com.cg.main.entities.Composer_song;
import com.cg.main.repository.ComposerRepository;
import com.cg.main.repository.ComposerSongRepository;

@Service
public class ComposerService {
	@Autowired
	private ComposerRepository composerRepository;
	
	  public Composer addComposer(Composer composer) { 
	  
	  return composerRepository.save(composer); }
	  
	  public List<Composer> getAllComposer() {
	  
	  return composerRepository.findAll(); }
	  
	  public ComposerRepository getComposerRepository() { return
	  composerRepository; }
	  
	  public void setComposerRepository(ComposerRepository composerRepository) {
	 this.composerRepository = composerRepository; }
	 
	  public Composer updateComposer(int composer_id, Composer composer) {
	  
	  return composerRepository.updateComposer(composer_id,composer); }

	public Composer addOneComposer(Composer composer) {
		return composerRepository.save(composer);
	}

	
	 

	/*
	 * public Composer addComposer(Composer composer) {
	 * 
	 * return composerRepository.save(composer); }
	 * 
	 * public Composer getComposer(int composer_id) { // if
	 * (ValiadateEmpId(Composer_Id)) return composerRepository.getOne(composer_id);
	 * // else // return null; }
	 * 
	 * private boolean ValidateSong_Id(int composer_id) { Composer composer =
	 * composerRepository.findOne(composer_id); if (composer != null) return true;
	 * else return false; }
	 * 
	 * public List<Composer> getAllComposers() { // TODO Auto-generated method stub
	 * return composerRepository.findAll(); }
	 * 
	 * public Composer updateComposer(Composer composer) {
	 * 
	 * 
	 * Composer_song composersong = composerSongRepository.findOne(composer_id);
	 * BeanUtils.copyProperties(composersong, composersong);
	 * 
	 * return composerRepository.save(composer); }
	 * 
	 * 
	 * 
	 * public Composer deleteComposerDetails(int composer_id) { //if
	 * (ValidateComposer_Id(composer_id)) composerRepository.delete(composer_id);
	 * return null; }
	 * 
	 * 
	 */

}

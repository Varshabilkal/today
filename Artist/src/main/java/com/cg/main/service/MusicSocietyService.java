package com.cg.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.main.entities.MusicSociety;
import com.cg.main.entities.Song;
import com.cg.main.repository.MusicSocietyRepository;
import com.cg.main.repository.SongRepository;

@Service
public class MusicSocietyService {
	@Autowired
	private MusicSocietyRepository musicsocietyRepository;

	public MusicSociety addMusicSociety(MusicSociety musicsociety) {

		return musicsocietyRepository.save(musicsociety);
	}

	public MusicSociety getSong(String Composer_MusicSocietyID) {
	//	if (ValiadateEmpId(Composer_Id))
			return musicsocietyRepository.getOne(Composer_MusicSocietyID);
	//	else
		//	return null;
	}

	/*
	 * private boolean ValiadateSong_Id(String Composer_MusicSocietyID) {
	 * MusicSociety musicsociety =
	 * musicsocietyRepository.findOne(Composer_MusicSocietyID); if (musicsociety !=
	 * null) return true; else return false; }
	 */
	public List<MusicSociety> getAllMusicSocietys() {
		// TODO Auto-generated method stub
		return musicsocietyRepository.findAll();
	}

	public MusicSociety updateMusicSociety(MusicSociety musicsociety) {
		
		/*
		 * Composer_song composersong = composerSongRepository.findOne(Composer_Id);
		 * BeanUtils.copyProperties(composersong, composersong);
		 */
		return musicsocietyRepository.save(musicsociety);
	}

	

	/*
	 * public void deleteSongDetails(String Composer_MusicSocietyID) { //if
	 * (ValidateComposer_MusicSocietyID(Composer_MusicSocietyID))
	 * musicsocietyRepository.delete(Composer_MusicSocietyID);
	 * 
	 * 
	 * }
	 */

}

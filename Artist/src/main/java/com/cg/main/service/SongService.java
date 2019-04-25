package com.cg.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.main.entities.Composer_song;
import com.cg.main.entities.Song;
import com.cg.main.repository.ComposerSongRepository;
import com.cg.main.repository.SongRepository;

@Service
public class SongService {
	@Autowired
	private SongRepository songRepository;

	public Song addSong(Song song) {

		return songRepository.save(song);
	}

	public Song getSong(int song_id) {
		// if (ValiadateEmpId(Composer_Id))
		return songRepository.getOne(song_id);
		// else
		// return null;
	}

	/*
	 * private boolean ValiadateSong_Id(int song_id) { Song song =
	 * songRepository.findOne(song_id); if (song != null) return true; else return
	 * false; }
	 */

	public List<Song> getAllSongs() {
		// TODO Auto-generated method stub
		return songRepository.findAll();
	}
}
	
/*
 * public Song updateSong(int song_id) { }
 */
	 
	/*  Song song =songRepository.findOne(song_id);
	//  BeanUtils.copyProperties(composersong, composersong);
	  
	 return songRepository.save(song); }
	 

	public void deleteSongDetails(int song_id) {
		if (ValiadateSong_Id(song_id))
			songRepository.delete(song_id);

	}
*/
	



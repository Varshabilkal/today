package com.cg.main.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.main.entities.Artist_Song;
import com.cg.main.repository.ArtistSongRepository;

@Service
public class ArtistSongService {
	@Autowired
	private ArtistSongRepository artistSongRepository;

	public Artist_Song addArtist_Song(Artist_Song artistsong) {

		return artistSongRepository.save(artistsong);
	}

	public Artist_Song getArtist_Song(int artist_id) {
	//	if (ValiadateEmpId(Composer_Id))
			return artistSongRepository.getOne(artist_id);
	//	else
		//	return null;
	}

	/*
	 * private boolean ValiadateSong_Id(int artist_id) { Artist_Song artistsong =
	 * artistSongRepository.findOne(artist_id); if (artistsong != null) return true;
	 * else return false; }
	 */

	public List<Artist_Song> getAllArtist_Songs() {
		return artistSongRepository.findAll();
	}

 	public Artist_Song updateArtist_Song(Artist_Song artistsong) {
		
		/*
		 * Composer_song composersong = composerSongRepository.findOne(Composer_Id);
		 * BeanUtils.copyProperties(composersong, composersong);
		 */
		return artistSongRepository.save(artistsong);
	}

}
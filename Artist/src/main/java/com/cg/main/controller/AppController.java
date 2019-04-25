package com.cg.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cg.main.entities.Artist;
import com.cg.main.entities.Artist_Song;
import com.cg.main.entities.Composer;
import com.cg.main.entities.Composer_song;
import com.cg.main.exception.ArtistException;
import com.cg.main.service.ArtistService;
import com.cg.main.service.ArtistSongService;
import com.cg.main.service.ComposerService;
import com.cg.main.service.Composer_songService;
import com.cg.main.service.SongService;


@RestController
public class AppController<Song> {
	
	@Autowired
	private ComposerService composerService;

	
	@Autowired
	private ArtistService artistService;
	
	@Autowired
	private Composer_songService composerSongService;
	
	@Autowired
	private ArtistSongService artistSongService;
	
	/********Composer************/
	 @Autowired 
	 private SongService songService;
	@RequestMapping("/composer/{composer_id}")    
	public Composer getComposerDetails(@PathVariable Composer composer_id) throws ArtistException {
	return composerService.addComposer(composer_id);}   

	@RequestMapping("/composer")    
	public List<Composer> getAllComposer() throws ArtistException {
	return composerService.getAllComposer();
		} 
		
	//-----------------------
	
	
	  @RequestMapping(value = "/composer", method= RequestMethod.POST) public
	  Composer addOneComposer(@RequestBody Composer composer) throws
	  ArtistException{ return composerService.addOneComposer(composer);
	  
	  }
	 
	
	
	@RequestMapping(method= RequestMethod.PUT, value ="/composer/{composer_id}" )
	public Composer updateComposer(@RequestBody Composer composer, @PathVariable int composer_id) throws ArtistException {
		return composerService.updateComposer(composer_id,composer);
		}

	/********for artist
	
	
	@RequestMapping("/artist/{artist_id}")    
	public Artist getArtistDetails(@PathVariable Artist artist_id) throws ArtistException {
			return artistService.addArtist(artist_id);}   

	/*
	 * @RequestMapping("/artist") public List<Artist> getAllArtist() throws
	 * ArtistException { return artistService.getAllArtist(); }
	 */
	//@PostMapping("/artist")
	@RequestMapping(method=RequestMethod.POST, value="/artist")
	public ResponseEntity<Artist> addArtist(@RequestBody Artist artist) throws ArtistException {
		Artist artistadded = artistService.addArtist(artist);
		return  new ResponseEntity<Artist>(artistadded, HttpStatus.OK);
	}

	/*
	 * @RequestMapping(method= RequestMethod.PUT, value ="/artist/{artist_id}" )
	 * public Artist updateArtist(@RequestBody Artist artist, @PathVariable int
	 * artist_id) throws ArtistException { return
	 * artistService.updateArtist(artist_id, artist); }
	 */
	//3.composer song
	
	@RequestMapping("/composersong/{composer_id}")    
	public Composer_song getComposer_songDetails(@PathVariable Composer_song composersong) throws ArtistException {
			return composerSongService.addComposer_song(composersong);}   

	@RequestMapping("/composersong")    
	public List<Composer_song> getAllComposer_song() throws ArtistException {
		return composerSongService.getAllComposer_song();
		} 
		
	
	@RequestMapping(value="/composersong",method=RequestMethod.POST)
	public ResponseEntity<Composer_song> addComposer_song(@RequestBody Composer_song composersong) throws ArtistException {
		Composer_song composersongadded = composerSongService.addComposer_song(composersong);
		return  new ResponseEntity<Composer_song>(composersongadded, HttpStatus.OK);
	}
	@RequestMapping(method= RequestMethod.PUT, value ="/composersong/{composer_id}" )
	public Composer_song updateComposer_song(@RequestBody Composer_song composersong, @PathVariable int composer_id) throws ArtistException {
		return composerSongService.addComposer_song(composersong);
		}
/************4.ArtistSong***/
	
	@RequestMapping("/artistsong/{artist_id}")    
	public Artist_Song getArtist_SongDetails(@PathVariable Artist_Song artistsong) throws ArtistException {
			return artistSongService.addArtist_Song(artistsong);}   

	@RequestMapping("/artistsong")    
	public List<Artist_Song> getAllArtist_Song() throws ArtistException {
		return artistSongService.getAllArtist_Songs();
		} 
		@RequestMapping(method=RequestMethod.POST, value="/artistsong")
		public ResponseEntity<Artist_Song>addCArtist_Song(@RequestBody Artist_Song artistcomposer) throws ArtistException {
			Artist_Song composeradded = artistSongService.addArtist_Song(artistcomposer);
			
				return new ResponseEntity<Artist_Song>(composeradded, HttpStatus.OK);}
	@RequestMapping(method= RequestMethod.PUT, value ="/artistsong/{artist_id}" )
	public Artist_Song updateArtist_Song(@RequestBody Artist_Song artistsong, @PathVariable int artist_id) throws ArtistException {
		return artistSongService.updateArtist_Song(artistsong);
		}
	
	
	 /**********song*****/
	  
	  @RequestMapping(method = RequestMethod.POST,value = "/Song")
	  public ResponseEntity<Song>addSong( @RequestBody Song song) throws ArtistException {
		  @SuppressWarnings("unchecked")
		Song songadded=(Song) songService.addSong((com.cg.main.entities.Song) song);
		  return new ResponseEntity<Song>(songadded, HttpStatus.OK);
	  }
	  
	  @RequestMapping("/Song") public List<Song> getAllSong() throws ArtistException{
	  
	  return (List<Song>) songService.getAllSongs(); }
	  
	 

	}


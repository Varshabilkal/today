package com.cg.main.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})  
@SequenceGenerator(name="seq",sequenceName = "seq", initialValue= 100000, allocationSize=10112000)
public class Composer_song {
	private int composerSongId;
	@Id
	private int composer_id;
	private int song_id;
	private int created_by;
	private String created_on;
	private int updated_by;
	private String updated_on;
	
	/*
	 * @JsonIgnore
	 * 
	 * @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "composer_id", insertable = false, updatable = false)
	 * private Composer composer;
	 */
	/*
	 * @JsonIgnore
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "song_id", insertable = false, updatable = false) private
	 * Song song;
	 */
	
	
	
	public int getComposer_id() {
		return composer_id;
	}
	public void setComposer_id(int composer_id) {
		this.composer_id = composer_id;
	}
	public int getSong_id() {
		return song_id;
	}
	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}
	public int getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}
	public String getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(String updated_on) {
		this.updated_on = updated_on;
	}
	public int getComposerSongId() {
		return composerSongId;
	}
	public void setComposerSongId(int composerSongId) {
		this.composerSongId = composerSongId;
	}
	
	
	

}

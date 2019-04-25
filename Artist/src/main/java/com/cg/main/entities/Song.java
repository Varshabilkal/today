package com.cg.main.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})      
@SequenceGenerator(name="seq",sequenceName = "seq", initialValue= 100000, allocationSize=10112000)
public class Song {
	@Id
	private int song_id;
	private String song_name;
	private long song_duration;
	private int created_by;
	private String created_on;
	private int updated_by;
	private String updated_On;
	private boolean song_deletedFlag;
	
	/*
	 * @JsonIgnore
	 * 
	 * @OneToOne(mappedBy = "song") private Composer_song composerSong;
	 */
	
	
	public String getSong_name() {
		return song_name;
	}
	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}
	public long getSong_duration() {
		return song_duration;
	}
	public void setSong_duration(long song_duration) {
		this.song_duration = song_duration;
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
	public String getUpdated_On() {
		return updated_On;
	}
	public void setUpdated_On(String updated_On) {
		this.updated_On = updated_On;
	}
	public boolean isSong_deletedFlag() {
		return song_deletedFlag;
	}
	public void setSong_deletedFlag(boolean song_deletedFlag) {
		this.song_deletedFlag = song_deletedFlag;
	}
	public int getSong_id() {
		return song_id;
	}
	public void setSong_id(int song_id) {
		this.song_id = song_id;
	}
	
	

}

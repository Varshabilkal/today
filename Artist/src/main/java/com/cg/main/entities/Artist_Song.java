package com.cg.main.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})      
public class Artist_Song {
	@Id
	@SequenceGenerator(name = "artist_id",sequenceName ="artist_id",initialValue = 1000, allocationSize =1 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "artist_id" )
  private int artist_id;
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
	 * @JoinColumn(name = "artist_id", insertable = false, updatable = false)
	 * private Artist artist;
	 * 
	 * 
	 * @JsonIgnore
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "song_id",insertable = false, updatable = false) private
	 * Song song;
	 */
public int getArtist_Id() {
	return artist_id;
}
public void setArtist_Id(int artist_Id) {
	artist_id = artist_Id;
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
public int getArtist_id() {
	return artist_id;
}
public void setArtist_id(int artist_id) {
	this.artist_id = artist_id;
}


  
  
}

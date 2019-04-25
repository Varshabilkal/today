package com.cg.main.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})      
public class Artist {
@Id
@SequenceGenerator(name = "artist_id",sequenceName ="artist_id",initialValue = 1000, allocationSize =1 )
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "artist_id" )
private int artist_id;
private String artist_name;
private String type;
private String artist_dob;
private String artist_dod;
private int created_by;
private String created_on;
private int updated_by;
private String updated_on;
private boolean flag;




	/*
	 * @JsonIgnore
	 * 
	 * @OneToMany(mappedBy = "artist") private List<Artist_Song> ArtistSong;
	 */
public int getArtist_id() {
	return artist_id;
}
public void setArtist_id(int artist_id) {
	this.artist_id = artist_id;
}
public String getArtist_name() {
	return artist_name;
}
public void setArtist_name(String artist_name) {
	this.artist_name = artist_name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public int getCreated_by() {
	return created_by;
}
public void setCreated_by(int created_by) {
	this.created_by = created_by;
}

public String getArtist_dob() {
	return artist_dob;
}
public void setArtist_dob(String artist_dob) {
	this.artist_dob = artist_dob;
}
public String getArtist_dod() {
	return artist_dod;
}
public void setArtist_dod(String artist_dod) {
	this.artist_dod = artist_dod;
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
public boolean isFlag() {
	return flag;
}
public void setFlag(boolean flag) {
	this.flag = flag;
}

}

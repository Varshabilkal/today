package com.cg.main.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})     
@SequenceGenerator(name="seq",sequenceName = "seq", initialValue= 100000, allocationSize=10112000)
public class MusicSociety {
	@Id
	private String Composer_MusicSocietyID;
	private String Composer_MusicSocietyName;
	public String getComposer_MusicSocietyID() {
		return Composer_MusicSocietyID;
	}
	public void setComposer_MusicSocietyID(String composer_MusicSocietyID) {
		Composer_MusicSocietyID = composer_MusicSocietyID;
	}
	public String getComposer_MusicSocietyName() {
		return Composer_MusicSocietyName;
	}
	public void setComposer_MusicSocietyName(String composer_MusicSocietyName) {
		Composer_MusicSocietyName = composer_MusicSocietyName;
	}
	@Override
	public String toString() {
		return "MusicSociety [Composer_MusicSocietyID=" + Composer_MusicSocietyID + ", Composer_MusicSocietyName="
				+ Composer_MusicSocietyName + "]";
	}

}

package com.cg.main.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Composer {
	@Id
	@SequenceGenerator(name = "composerid",sequenceName ="composerid",initialValue = 1000, allocationSize =1 )
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "composerid" )
	private int composerId;
	private String composer_name;
	private String composer_dob;
	private String composer_died;
	private String composer_caeipino;
	private String composer_msid;
	private int created_by;
	private String created_on;
	private int updated_by;
	private String updated_on;
	private boolean deletedflag;

	/*
	 * @JsonIgnore
	 * 
	 * @OneToMany(mappedBy = "composer") private List<Composer_song> composerSong;
	 */
	public int getComposerId() {
		return composerId;
	}

	public void setcomposerId(int composerId) {
		this.composerId = composerId;
	}

	public String getComposer_name() {
		return composer_name;
	}

	public void setComposer_name(String composer_name) {
		this.composer_name = composer_name;
	}

	public String getComposer_caeipino() {
		return composer_caeipino;
	}

	public void setComposer_caeipino(String composer_caeipino) {
		this.composer_caeipino = composer_caeipino;
	}

	public String getComposer_msid() {
		return composer_msid;
	}

	public void setComposer_msid(String composer_msid) {
		this.composer_msid = composer_msid;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public String getComposer_dob() {
		return composer_dob;
	}

	public void setComposer_dob(String composer_dob) {
		this.composer_dob = composer_dob;
	}

	public String getComposer_died() {
		return composer_died;
	}

	public void setComposer_died(String composer_died) {
		this.composer_died = composer_died;
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

	

	public boolean isDeletedflag() {
		return deletedflag;
	}

	public void setDeletedflag(boolean deletedflag) {
		this.deletedflag = deletedflag;
	}

	@Override
	public String toString() {
		return "Composer [composerId=" + composerId + ", composer_name=" + composer_name + ", composer_dob="
				+ composer_dob + ", composer_died=" + composer_died + ", composer_caeipino=" + composer_caeipino
				+ ", composer_msid=" + composer_msid + ", created_by=" + created_by + ", created_on=" + created_on
				+ ", updated_by=" + updated_by + ", updated_on=" + updated_on + ", deletedflag=" + deletedflag + "]";
	}

}

package com.demoProject.AppManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Application")
public class Application {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TASK_SEQ")
//	@SequenceGenerator(name="TASK_SEQ", sequenceName="TASK01")
//	   @SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 1, allocationSize = 100)
//    @GeneratedValue(generator = "mySeqGen")
	private int ID;
	@Column(name ="NAME")
	private String name;
	@Column(name ="DESCRIPTION")
	private String description;
	
	Application(){
		
	}

	 public Application(int ID, String name, String description) {
		super();
		this.ID = ID;
		this.name = name;
		this.description = description;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Application [ID=" + ID + ", name=" + name + ", description=" + description + "]";
	}
	
}

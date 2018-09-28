package com.pictures.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image {
	@Id
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="creator")
	private String creator;

	public Image(String name, String description, String imageUrl, String creator) {
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.creator = creator;
	}
	
	public Image() {
		
	}
}

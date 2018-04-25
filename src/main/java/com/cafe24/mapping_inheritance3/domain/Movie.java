package com.cafe24.mapping_inheritance3.domain;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "MOVIE_ID"))
public class Movie extends Item {

	private String actor;

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movie [actor=" + actor + ", getId()=" + getId() + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + "]";
	}

}

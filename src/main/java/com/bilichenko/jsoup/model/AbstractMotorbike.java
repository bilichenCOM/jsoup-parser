package com.bilichenko.jsoup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "motorbikes")
public abstract class AbstractMotorbike {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "manufacturer_name")
	private String manufacturerName;

	@Column(name = "model_name")
	private String modelName;

	private String year;
	private Double cc;
	private Double price;

	@Column(name = "image_url")
	private String imageUrl;

	public AbstractMotorbike() {
	}

	public AbstractMotorbike(Long id, String manufacturerName, String modelName, String year, Double cc, Double price,
			String imageUrl) {
		this.id = id;
		this.manufacturerName = manufacturerName;
		this.modelName = modelName;
		this.year = year;
		this.cc = cc;
		this.price = price;
		this.imageUrl = imageUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Double getCc() {
		return cc;
	}

	public void setCc(Double cc) {
		this.cc = cc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cc == null) ? 0 : cc.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((manufacturerName == null) ? 0 : manufacturerName.hashCode());
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractMotorbike other = (AbstractMotorbike) obj;
		if (cc == null) {
			if (other.cc != null)
				return false;
		} else if (!cc.equals(other.cc))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (manufacturerName == null) {
			if (other.manufacturerName != null)
				return false;
		} else if (!manufacturerName.equals(other.manufacturerName))
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AbstractMotorbike [id=" + id + ", manufacturerName=" + manufacturerName + ", modelName=" + modelName
				+ ", year=" + year + ", cc=" + cc + ", price=" + price + ", imageUrl=" + imageUrl + "]";
	}
}
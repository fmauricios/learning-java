package me.mauricioserna.hibernate.model;

import java.io.Serializable;


public class SocialMedia implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long idSocialMedia;
	private String name;
	private String icon;
	
	public SocialMedia() {
		super();
	}
	
	public SocialMedia(String name, String icon) {
		super();
		this.name = name;
		this.icon = icon;
	}

	public Long getIdSocialMedia() {
		return idSocialMedia;
	}
	public void setIdSocialMedia(Long idSocialMedia) {
		this.idSocialMedia = idSocialMedia;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}

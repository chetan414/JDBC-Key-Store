package com.ty.key_store.dto;

public class Key_Store {
	
	private int uid;
	private String comment;
	private String description;
	private String key;
	private String value;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		System.out.println("User Id: "+uid);
		System.out.println("Comment: "+comment);
		System.out.println("Description: "+description);
		System.out.println("Key: "+key);
		System.out.println("Value: "+value);
		System.out.println("-------------------------------");
		return "";
	}
	
	
}


package com.example.uibestpractice;


public class Msg {
	public static final int TYPE_RECEIVED = 0;
	public static final int TYPE_SENT = 1;
	private String content;
	private int type;
	
	public  Msg(String content,int type) {
		// TODO 自动生成的构造函数存根
		this.content = content;
		this.type = type;
	}
	
	public String getContent(){
		return content;
	}
	
	public int getType(){
		return type;
	}
}

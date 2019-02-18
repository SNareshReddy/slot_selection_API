package com.servpro.model;

public class SlotMsg{

	private String msg;
	
	

	public SlotMsg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SlotMsg(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "SlotMsg [msg=" + msg + "]";
	}
	
}

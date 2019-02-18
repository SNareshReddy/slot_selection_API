package com.servpro.model;


public class SlotMessage {
	
	private int sId;
	private String slotTiming;
	
	public SlotMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SlotMessage(int sId, String slotTiming) {
		super();
		this.sId = sId;
		this.slotTiming = slotTiming;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getSlotTiming() {
		return slotTiming;
	}

	public void setSlotTiming(String slotTiming) {
		this.slotTiming = slotTiming;
	}

	@Override
	public String toString() {
		return "SlotMessage [sId=" + sId + ", slotTiming=" + slotTiming + "]";
	}

	

}

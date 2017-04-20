package com.wiselink.main;

public class PinyinBean implements Comparable<PinyinBean>{
	private String parkName;
	private char headLetter;

	public PinyinBean(String parkName, char headLetter) {
		super();
		this.parkName = parkName;
		this.headLetter = headLetter;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public char getHeadLetter() {
		return headLetter;
	}

	public void setHeadLetter(char headLetter) {
		this.headLetter = headLetter;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public int compareTo(PinyinBean o) {
		// TODO Auto-generated method stub
		return headLetter - o.getHeadLetter();
	}
}

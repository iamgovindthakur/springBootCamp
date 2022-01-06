package com.iamgovindthakur.com.ReadingValueFromPropertiesFile.Model;

public class LimitService {

	private int max;
	private int min;

	public LimitService() {

	}

	public LimitService(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public String getMessage() {
		return "Good Morning";
	}

}

/**
 * 
 */
package com.example.helloworld;

/**
 * @author llkelley
 * 
 */
public class Second {

	private boolean mCorrectValue;
	private int mSeconds;
	private int mHours;
	private String mTime;

	/**
	 * @param seconds
	 * @param hours
	 */
	public Second(int seconds, int hours) {
		super();
		mSeconds = seconds;
		mHours = hours;
	}

	/**
	 * @return the correctValue
	 */
	public boolean isCorrectValue() {
		return mCorrectValue;
	}

	/**
	 * @param correctValue
	 *            the correctValue to set
	 */
	public void setCorrectValue(boolean correctValue) {
		mCorrectValue = correctValue;
	}

	/**
	 * @return the seconds
	 */
	public int getSeconds() {
		return mSeconds;
	}

	/**
	 * @param seconds
	 *            the seconds to set
	 */
	public void setSeconds(int seconds) {
		mSeconds = seconds;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return mHours;
	}

	/**
	 * @param hours
	 *            the hours to set
	 */
	public void setHours(int hours) {
		mHours = hours;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return mTime;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(String time) {
		mTime = time;
	}

}

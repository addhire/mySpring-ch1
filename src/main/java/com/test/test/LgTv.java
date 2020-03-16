package com.test.test;

public class LgTv implements TV {

	@Override
	public void turnOn() {
		System.out.println("LGTV - 전원 On");

	}

	@Override
	public void turnOff() {
		System.out.println("LGTV - 전원 Off");

	}

	@Override
	public void soundUp() {
		System.out.println("LGTV - 전원 up");

	}

	@Override
	public void soundDown() {
		System.out.println("LGTV - 사운드 down");

	}

}

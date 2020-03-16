package com.test.test;

public class SonySpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("SonySpeaker SoundUp");
	}

	@Override
	public void soundDown() {
		System.out.println("SonySpeaker SoundDown");

	}

}

package com.test.test;

public class AppleSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker SoundUp");
	}

	@Override
	public void soundDown() {
		System.out.println("AppleSpeaker SoundDown");

	}

}

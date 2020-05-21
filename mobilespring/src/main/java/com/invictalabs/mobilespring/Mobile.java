package com.invictalabs.mobilespring;

import org.springframework.context.ApplicationContext;

public class Mobile {

	private Camera cam;
	private Screen screen;
	private Speaker speaker;

	ApplicationContext factory;

	public Camera getCam() {
		return cam;
	}

	public void setCam(Camera cam) {
		this.cam = cam;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	void printSpecifications() {
		System.out.println("Camera megapixels    : " + cam.getMegaPixels());
		System.out.println("Screen dimensions    : " + screen.getLen() + "x" + screen.getBre());
		System.out.println("Speaker type         : " + speaker.getSpeakerType());
		System.out.println("Speaker Volume Level : " + speaker.getVolumeLevel());
	}

}

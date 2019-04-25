package com.szjz.adapterPattern.Impl;

import com.szjz.adapterPattern.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("play mp4 file :" + fileName);

	}

}

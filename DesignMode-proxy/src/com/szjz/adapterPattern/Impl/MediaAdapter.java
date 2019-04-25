package com.szjz.adapterPattern.Impl;

import com.szjz.adapterPattern.interfaces.AdvancedMediaPlayer;
import com.szjz.adapterPattern.interfaces.MediaPlayer;

/**
 * 创建适配器   主要适配视频播放器
 * @author 石中君子
 *
 */
public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer adcvancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			adcvancedMusicPlayer = new VlcPlayer();
		} else {
			adcvancedMusicPlayer = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			adcvancedMusicPlayer.playVlc(fileName);
		} else {
			adcvancedMusicPlayer.playMp4(fileName);
		}

	}

}

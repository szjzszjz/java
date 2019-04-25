package com.szjz.adapterPattern.Impl;

import com.szjz.adapterPattern.interfaces.AdvancedMediaPlayer;
import com.szjz.adapterPattern.interfaces.MediaPlayer;

/**
 * ����������   ��Ҫ������Ƶ������
 * @author ʯ�о���
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

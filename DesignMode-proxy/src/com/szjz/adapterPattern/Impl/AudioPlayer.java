package com.szjz.adapterPattern.Impl;

import com.szjz.adapterPattern.interfaces.MediaPlayer;

/**
 * ͨ��������  ʹ����Ƶ���������Բ�����Ƶ
 * @author ʯ�о���
 *
 */
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		
		//����֧�ֲ���MP3
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("play mp3 file :"+ fileName);
		}
		//�ṩ���������ļ���֧��
		else if (audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media. "+
		            audioType + " format not supported");
		}
	}

}

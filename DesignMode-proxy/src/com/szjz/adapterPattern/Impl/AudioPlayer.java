package com.szjz.adapterPattern.Impl;

import com.szjz.adapterPattern.interfaces.MediaPlayer;

/**
 * 通过适配器  使得音频播放器可以播放视频
 * @author 石中君子
 *
 */
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		
		//内置支持播放MP3
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("play mp3 file :"+ fileName);
		}
		//提供播放其他文件的支持
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

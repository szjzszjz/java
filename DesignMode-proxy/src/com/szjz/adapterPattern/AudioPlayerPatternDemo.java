package com.szjz.adapterPattern;

import com.szjz.adapterPattern.Impl.AudioPlayer;

public class AudioPlayerPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "test.mp3");
		audioPlayer.play("vlc", "test.vlc");
		audioPlayer.play("mp4", "test.mp4");
		audioPlayer.play("alv", "test.alv");
	}
}

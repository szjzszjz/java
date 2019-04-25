package com.szjz.adapterPattern.interfaces;

/**
 * 高级媒体播放器   可以播放视频
 * @author 石中君子
 *
 */
public interface AdvancedMediaPlayer {

	public void playVlc(String fileName);
	public void playMp4(String fileName);
	
}

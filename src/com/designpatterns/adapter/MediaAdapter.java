package com.designpatterns.adapter;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMediaPlayer;
	

	/* (non-Javadoc)
	 * @see com.designpatterns.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMediaPlayer=new VlcPlayer();
			advancedMediaPlayer.playVlc(fileName);
		}
		if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer=new Mp4Player();
			advancedMediaPlayer.playMp4(fileName);
		}
	}
}
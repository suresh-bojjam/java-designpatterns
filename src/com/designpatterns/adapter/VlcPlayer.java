package com.designpatterns.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

	/* (non-Javadoc)
	 * @see com.designpatterns.adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing VLC");
	}

}

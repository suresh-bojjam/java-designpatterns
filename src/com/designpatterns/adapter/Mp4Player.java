package com.designpatterns.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	/* (non-Javadoc)
	 * @see com.designpatterns.adapter.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4");
	}

	/* (non-Javadoc)
	 * @see com.designpatterns.adapter.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		
	}

}

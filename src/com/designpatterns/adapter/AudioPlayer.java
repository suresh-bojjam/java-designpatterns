package com.designpatterns.adapter;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	
	public AudioPlayer(){
		
	}
	
	public AudioPlayer(MediaAdapter mediaAdapter){
		this.mediaAdapter=mediaAdapter;
	}
	
	/* (non-Javadoc)
	 * @see com.designpatterns.adapter.MediaPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3"))
			System.out.println("Playing Song: "+fileName);
		else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc")){
			mediaAdapter.play(audioType, fileName);
		}else{
			System.out.println("Invalid Media");
		}
	}
	
	public static void main(String args[]){
		AudioPlayer player=new AudioPlayer(new MediaAdapter());
		player.play("mp3","file.mp3");
		player.play("mp4","file.mp4");
		player.play("vlc","file.vlc");
	}
}
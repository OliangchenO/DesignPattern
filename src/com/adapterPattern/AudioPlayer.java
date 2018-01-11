package com.adapterPattern;

public class AudioPlayer implements MediaPlayer {
	MediaPlayer mediaPlayer;

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		// ���� mp3 �����ļ�������֧��
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaPlayer = new MediaAdapter(audioType);
			mediaPlayer.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}

}

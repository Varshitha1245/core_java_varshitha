package org.tnsif.c2tc.interface_demo;


interface Camera{
	void takePhoto();
	
}
interface MusicPlayer{
	void playMusic();
}
class SmartPhone implements Camera, MusicPlayer {

	@Override
	public void playMusic() {
		System.out.println("taking a photo with the smartphone camera");// TODO Auto-generated method stub
		
	}

	@Override
	public void takePhoto() {
		System.out.println("playing music on the smartphone");// TODO Auto-generated method stub
		
	}
	
}
public class MultipleInterface {

	public static void main(String[] args) {
		SmartPhone s = new SmartPhone();
		s.playMusic();
		s.takePhoto();// TODO Auto-generated method stub

	}

}

package fcu.iecs.oop;

public class hw1 {
	public static void main(String[] args){
		String lyrics = "Let it go! Let it go! Cannot hold it back anymore";
		String new_lyrics = lyrics.replaceAll("it", "\"her\"");	
		new_lyrics = new_lyrics.replaceAll("Cannot", "Can't");
		lyrics = new_lyrics;
		System.out.println("Launch : " + lyrics);
	}
}

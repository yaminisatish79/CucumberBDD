package com.Sample;
class song {
	String title;
	String lyricist;
	String musicDir;
	
	void playIt() {
		System.out.println("playing the song title" +title+ "written by" + lyricist+ "music director is " + musicDir); 
	}
	}
	




public class songPlay {
public static void main(String args[]) {
song s = new song();
s.title = "ennai konjam matri";
s.lyricist = "thamarai";
s.musicDir = "harris jeyaraj";
s.playIt();

song s1 = new song();
s1.title = "munbe va";
s1.lyricist = "vairamuthu";
s1.musicDir = "a.r.rahman";
s1.playIt();
}
}

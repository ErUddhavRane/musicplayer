//package musicplayer;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Scanner;
//import java.util.jar.Attributes.Name;
//
//public class SongOperation {
//	private String SongName;
//	private String artiSt;
//	private ArrayList<Song> songs;
//
//	public SongOperation(String songName, String artiSt, ArrayList<Song> songs) {
//		super();
//		SongName = songName;
//		this.artiSt = artiSt;
//	}
//
//	public SongOperation() {
//
//	}
//
//	public boolean AddSong(String Name, double Duration) {
//		if (findSong(Name) == null) {
//			songs.add(new Song(Name, Duration));
//			System.out.println(Name + "Succssfully Added to the List");
//			return true;
//		}
//
//		else {
//			System.out.println("Song withSong Name " + Name + "already exixt in the List");
//		}
//		return false;
//
//	}
//
//	public Song findSong(String title) {
//		for (Song CheckedSong : songs) {
//			if (CheckedSong.getName().equals(SongName))
//				return CheckedSong;
//
//		}
//		return null;
//
//	}
//
//	public boolean AddPlayList(int TrackNumber, double d) {
//		int index = TrackNumber - 1;
//		if (index > 0 && index <= this.songs.size()) {
//			d.add(this.songs.get(index));
//			return true;
//		}
//		System.out.println("this album does not have songwith TrackNimber" + TrackNumber);
//		return false;
//	}
//
//	public boolean AddPlayList(String title, LinkedList<Song> playList) {
//		for (Song ChekedSong : this.songs) {
//			if (ChekedSong.getName().equals(title)) {
//				playList.add(ChekedSong);
//				return true;
//			}
//		}
//		return false;
//
//	}
//
//}

package org.example;

public class OnlineSong {
    public final String albumName;
    public final String artistName;
    public final int duration;
    public final String title;
    public final String imgUrl;
    public final String songUrl;
    public final String ytMusicID;
    public final String ytMusicPlyListID;

    public OnlineSong() {
        this.title = "";
        this.artistName = "";
        this.albumName = "";
        this.duration = -1;
        this.imgUrl = "";
        this.songUrl = "";
        this.ytMusicID="";
        this.ytMusicPlyListID="";
    }

    public OnlineSong( String _title, String _artistName, String _albumName, int _duration,
                     String imgUrl, String songUrl, String ytMusicID, String ytMusicPlyListID) {
        this.title = _title;
        this.artistName = _artistName;
        this.albumName = _albumName;
        this.duration = _duration;
        this.imgUrl = imgUrl;
        this.songUrl = songUrl;
        this.ytMusicID= ytMusicID;
        this.ytMusicPlyListID= ytMusicPlyListID;
    }


    @Override
    public String toString() {
        return "OnlineSong{" +
                "albumName='" + albumName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", duration=" + duration +
                ", title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", songUrl='" + songUrl + '\'' +
                ", ytMusicID='" + ytMusicID + '\'' +
                ", ytMusicPlyListID='" + ytMusicPlyListID + '\'' +
                '}';
    }
}

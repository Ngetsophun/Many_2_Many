package com.example.relation_manytomany.Model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(primaryKeys = {"playlistId","songId"})
public class PlaylistSongCrossRef {
    int playlistId;
    int songId;

    public PlaylistSongCrossRef(int playlistId, int songId) {
        this.playlistId = playlistId;
        this.songId = songId;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    @Override
    public String toString() {
        return "PlaylistSongCrossRef{" +
                "playlistId=" + playlistId +
                ", songId=" + songId +
                '}';
    }
}

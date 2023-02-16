package com.example.relation_manytomany.Relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.example.relation_manytomany.Model.Playlist;
import com.example.relation_manytomany.Model.PlaylistSongCrossRef;
import com.example.relation_manytomany.Model.Song;

import java.util.List;

public class PlaylistWithSong {
    @Embedded
    public  Playlist playlist;
    @Relation(
            parentColumn = "playlistId",
            entityColumn = "songId",
            associateBy = @Junction(PlaylistSongCrossRef.class)
    )
   public List<Song>songs;

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "PlaylistWithSong{" +
                "playlist=" + playlist +
                ", songs=" + songs +
                '}';
    }
}

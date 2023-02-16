package com.example.relation_manytomany.Relationship;


import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.example.relation_manytomany.Model.Playlist;
import com.example.relation_manytomany.Model.PlaylistSongCrossRef;
import com.example.relation_manytomany.Model.Song;

import java.util.List;

public class SongWithPlaylist {
    @Embedded
    public Song song;

    @Relation(
            parentColumn = "songId",
            entityColumn = "playlistId",
            associateBy = @Junction(PlaylistSongCrossRef.class)
    )
    public List<Playlist> playlists;

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    @Override
    public String toString() {
        return "SongWithPlaylist{" +
                "song=" + song +
                ", playlists=" + playlists +
                '}';
    }
}

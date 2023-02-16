package com.example.relation_manytomany.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Playlist {

    @PrimaryKey
    int playlistId;

    @ColumnInfo
    int userCreatorId;

    @ColumnInfo
    String playlistName;

    public Playlist(int playlistId, int userCreatorId, String playlistName) {
        this.playlistId = playlistId;
        this.userCreatorId = userCreatorId;
        this.playlistName = playlistName;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getUserCreatorId() {
        return userCreatorId;
    }

    public void setUserCreatorId(int userCreatorId) {
        this.userCreatorId = userCreatorId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlistId=" + playlistId +
                ", userCreatorId=" + userCreatorId +
                ", playlistName='" + playlistName + '\'' +
                '}';
    }
}

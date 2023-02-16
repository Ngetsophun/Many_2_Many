package com.example.relation_manytomany.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.relation_manytomany.Model.Playlist;
import com.example.relation_manytomany.Model.PlaylistSongCrossRef;
import com.example.relation_manytomany.Model.Song;
import com.example.relation_manytomany.Model.User;
import com.example.relation_manytomany.Relationship.PlaylistWithSong;
import com.example.relation_manytomany.Relationship.SongWithPlaylist;
import com.example.relation_manytomany.Relationship.UserWithPlaylist;
import com.example.relation_manytomany.Relationship.UserWithPlaylistAndSong;

import java.util.List;

@Dao
public interface DaoMM {

    @Transaction
    @Query("SELECT * FROM Playlist")
    List<PlaylistWithSong> getAllPlaylistWithsong();


    @Transaction
    @Query("SELECT * FROM Song")
    List<SongWithPlaylist> getAllSongwithPlaylist();

    @Transaction
    @Query("SELECT * FROM User")
    List<UserWithPlaylistAndSong> getAllUserWithPlaylistAndSong();


    @Transaction
    @Query("SELECT * FROM User")
    List<UserWithPlaylist> getAllUserWithPlaylist();



    @Transaction
    @Query("SELECT * FROM PlaylistSongCrossRef")
    List<PlaylistSongCrossRef> getAllPlaylistSongCross();

    @Insert
    void InsertUser(User user);

    @Insert
    void InsertSong(Song song);

    @Insert
    void InsertPlaylist(Playlist playlist);

    @Insert
    void InsertPlaylistSongCrossRef(PlaylistSongCrossRef playlistSongCrossRef);



}

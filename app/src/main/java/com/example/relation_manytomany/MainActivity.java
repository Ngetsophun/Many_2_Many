package com.example.relation_manytomany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;

import com.example.relation_manytomany.Model.Playlist;
import com.example.relation_manytomany.Model.PlaylistSongCrossRef;
import com.example.relation_manytomany.Model.Song;
import com.example.relation_manytomany.Model.User;
import com.example.relation_manytomany.Relationship.PlaylistWithSong;
import com.example.relation_manytomany.Relationship.SongWithPlaylist;
import com.example.relation_manytomany.Relationship.UserWithPlaylist;
import com.example.relation_manytomany.Relationship.UserWithPlaylistAndSong;
import com.example.relation_manytomany.databinding.ActivityMainBinding;

import java.util.List;

import kotlin.UShort;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Database.getInstance(getApplicationContext()).daoMM().InsertUser(new User(111,"keo",20));
        Database.getInstance(getApplicationContext()).daoMM().InsertUser(new User(222,"bora",17));

        Database.getInstance(getApplicationContext()).daoMM().InsertPlaylist(new Playlist(2,111,"Hip hop"));
        Database.getInstance(getApplicationContext()).daoMM().InsertPlaylist(new Playlist(3,222,"Romantic"));

        Database.getInstance(getApplicationContext()).daoMM().InsertPlaylistSongCrossRef(new PlaylistSongCrossRef(2,333));
        Database.getInstance(getApplicationContext()).daoMM().InsertPlaylistSongCrossRef(new PlaylistSongCrossRef(3,444));

        Database.getInstance(getApplicationContext()).daoMM().InsertSong(new Song(333,"kaka","Vanda"));
        Database.getInstance(getApplicationContext()).daoMM().InsertSong(new Song(444,"koko","Vanda"));

//
//
//        List<UserWithPlaylist> userWithPlaylists = Database.getInstance(this).daoMM().getAllUserWithPlaylist();
//
//        Log.d("koko","msg" + userWithPlaylists.toString());
         List<UserWithPlaylistAndSong> userWithPlaylistAndSongs = Database.getInstance(this).daoMM().getAllUserWithPlaylistAndSong();
         Log.d("rr","aaa" + userWithPlaylistAndSongs.toString());

//          List<UserWithPlaylistAndSong> userWithPlaylistAndSongs = Database.getInstance(this).daoMM().getAllUserWithPlaylistAndSong();
//          Log.d("oo","' ii" + userWithPlaylistAndSongs.toString());



//        List<SongWithPlaylist> songWithPlaylists = Database.getInstance(this) .daoMM().getAllSongwithPlaylist();
//
//        Log.d("papa","mm" + songWithPlaylists.toString());
//
//        List<PlaylistWithSong> playlistWithSongs = Database.getInstance(this).daoMM().getAllPlaylistWithsong();
//        Log.d("gg","ss" + playlistWithSongs.toString());



    }
}
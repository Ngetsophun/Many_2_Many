package com.example.relation_manytomany;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.relation_manytomany.Dao.DaoMM;
import com.example.relation_manytomany.Model.Playlist;
import com.example.relation_manytomany.Model.PlaylistSongCrossRef;
import com.example.relation_manytomany.Model.Song;
import com.example.relation_manytomany.Model.User;

@androidx.room.Database(entities = {Playlist.class, Song.class, User.class,PlaylistSongCrossRef.class},version = 2)
public abstract class Database extends RoomDatabase {

    public abstract DaoMM daoMM();

    public static volatile Database INSTANCE;
    public static Database getInstance(Context context){
        if
        (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),Database.class,"ManyToMany")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }


}

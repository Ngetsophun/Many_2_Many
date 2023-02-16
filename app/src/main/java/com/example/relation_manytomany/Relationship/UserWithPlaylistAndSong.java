package com.example.relation_manytomany.Relationship;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.relation_manytomany.Model.Playlist;
import com.example.relation_manytomany.Model.User;

import java.util.List;

public class UserWithPlaylistAndSong {
    @Embedded
    public User user;

    @Relation(
            entity = Playlist.class,
            parentColumn = "userId",
            entityColumn = "userCreatorId"

    )
    public List<PlaylistWithSong> playlists;

}

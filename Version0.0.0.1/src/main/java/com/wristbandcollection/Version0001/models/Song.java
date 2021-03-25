package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "song")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer songId;
    private Integer albumId;
    private Integer trackNumber;
    private String trackTitle;
    private BigDecimal runtime;

    public Song(){}

    public Song(Integer albumId, Integer trackNumber, String trackTitle, BigDecimal runtime) {
        this.albumId = albumId;
        this.trackNumber = trackNumber;
        this.trackTitle = trackTitle;
        this.runtime = runtime;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

    public BigDecimal getRuntime() {
        return runtime;
    }

    public void setRuntime(BigDecimal runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(songId, song.songId) && Objects.equals(albumId, song.albumId) && Objects.equals(trackNumber, song.trackNumber) && Objects.equals(trackTitle, song.trackTitle) && Objects.equals(runtime, song.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, albumId, trackNumber, trackTitle, runtime);
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", albumId=" + albumId +
                ", trackNumber=" + trackNumber +
                ", trackTitle='" + trackTitle + '\'' +
                ", runtime=" + runtime +
                '}';
    }
}

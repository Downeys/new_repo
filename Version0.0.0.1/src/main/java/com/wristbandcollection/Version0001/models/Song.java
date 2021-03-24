package com.wristbandcollection.Version0001.models;

import java.util.List;
import java.util.Objects;

public class Song {
    private Integer songId;
    private Integer trackNumber;
    private String trackTitle;
    private List<BandMember> guestMusicians;
    private Double runtime;

    public Song(){}

    public Song(Integer trackNumber, String trackTitle, Double runtime) {
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

    public List<BandMember> getGuestMusicians() {
        return guestMusicians;
    }

    public void setGuestMusicians(List<BandMember> guestMusicians) {
        this.guestMusicians = guestMusicians;
    }

    public Double getRuntime() {
        return runtime;
    }

    public void setRuntime(Double runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(songId, song.songId) && Objects.equals(trackNumber, song.trackNumber) && Objects.equals(trackTitle, song.trackTitle) && Objects.equals(guestMusicians, song.guestMusicians) && Objects.equals(runtime, song.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, trackNumber, trackTitle, guestMusicians, runtime);
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", trackNumber=" + trackNumber +
                ", trackTitle='" + trackTitle + '\'' +
                ", guestMusicians=" + guestMusicians +
                ", runtime=" + runtime +
                '}';
    }
}

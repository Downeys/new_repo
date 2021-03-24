package com.wristbandcollection.Version0001.modelViews;

import java.util.List;
import java.util.Objects;

public class SongModelView {
    private Integer songId;
    private Integer trackNumber;
    private String trackTitle;
    private List<BandMemberModelView> guestMusicians;
    private Double runtime;

    public SongModelView(){}

    public SongModelView(Integer trackNumber, String trackTitle, Double runtime) {
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

    public List<BandMemberModelView> getGuestMusicians() {
        return guestMusicians;
    }

    public void setGuestMusicians(List<BandMemberModelView> guestMusicians) {
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
        SongModelView songModelView = (SongModelView) o;
        return Objects.equals(songId, songModelView.songId) && Objects.equals(trackNumber, songModelView.trackNumber) && Objects.equals(trackTitle, songModelView.trackTitle) && Objects.equals(guestMusicians, songModelView.guestMusicians) && Objects.equals(runtime, songModelView.runtime);
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

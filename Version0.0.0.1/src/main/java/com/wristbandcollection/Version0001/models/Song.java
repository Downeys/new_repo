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
    private Long songId;
    private Integer trackNumber;
    private String trackTitle;
    private BigDecimal runtime;

    @ManyToOne(cascade = CascadeType.ALL) //checked
    @JoinColumn(name = "albumId", referencedColumnName = "albumId")
    private Album album;

    @ManyToOne
    @JoinColumn(name = "recordingStudioId", referencedColumnName = "recordingStudioId")
    private RecordingStudio recordingStudio;


    public Song(){}

    public Song(Integer trackNumber, String trackTitle, BigDecimal runtime) {
        this.trackNumber = trackNumber;
        this.trackTitle = trackTitle;
        this.runtime = runtime;
    }

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
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

    public BigDecimal getRuntime() {
        return runtime;
    }

    public void setRuntime(BigDecimal runtime) {
        this.runtime = runtime;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public RecordingStudio getRecordingStudio() {
        return recordingStudio;
    }

    public void setRecordingStudio(RecordingStudio recordingStudio) {
        this.recordingStudio = recordingStudio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(songId, song.songId) && Objects.equals(trackNumber, song.trackNumber) && Objects.equals(trackTitle, song.trackTitle) && Objects.equals(runtime, song.runtime) && Objects.equals(album, song.album) && Objects.equals(recordingStudio, song.recordingStudio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songId, trackNumber, trackTitle, runtime, album, recordingStudio);
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", trackNumber=" + trackNumber +
                ", trackTitle='" + trackTitle + '\'' +
                ", runtime=" + runtime +
                ", album=" + album +
                ", recordingStudio=" + recordingStudio +
                '}';
    }
}

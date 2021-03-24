package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer albumId;
    private String albumTitle;
    private RecordingStudio recordingStudio;
    private Integer trackId;
    @OneToMany(mappedBy = "trackId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Song> trackList;
    private BigDecimal price;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public RecordingStudio getRecordingStudio() {
        return recordingStudio;
    }

    public void setRecordingStudio(RecordingStudio recordingStudio) {
        this.recordingStudio = recordingStudio;
    }

    public List<Song> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Song> trackList) {
        this.trackList = trackList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(albumId, album.albumId) && Objects.equals(albumTitle, album.albumTitle) && Objects.equals(recordingStudio, album.recordingStudio) && Objects.equals(trackId, album.trackId) && Objects.equals(trackList, album.trackList) && Objects.equals(price, album.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, albumTitle, recordingStudio, trackId, trackList, price);
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", albumTitle='" + albumTitle + '\'' +
                ", recordingStudio=" + recordingStudio +
                ", trackId=" + trackId +
                ", trackList=" + trackList +
                ", price=" + price +
                '}';
    }
}

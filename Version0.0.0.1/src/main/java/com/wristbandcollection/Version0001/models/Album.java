package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long albumId;
    private LocalDate releaseDate;
    private String albumTitle;
    private BigDecimal price;

    @OneToMany(mappedBy = "album") //checked
    private List<Song> trackList;

    @ManyToOne //checked
    @JoinColumn(name = "artistId", referencedColumnName = "artistId")
    private Artist artist;

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        this.albumId = albumId;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Song> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Song> trackList) {
        this.trackList = trackList;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(albumId, album.albumId) && Objects.equals(releaseDate, album.releaseDate) && Objects.equals(albumTitle, album.albumTitle) && Objects.equals(price, album.price) && Objects.equals(trackList, album.trackList) && Objects.equals(artist, album.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, releaseDate, albumTitle, price, trackList, artist);
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", releaseDate=" + releaseDate +
                ", albumTitle='" + albumTitle + '\'' +
                ", price=" + price +
                ", trackList=" + trackList +
                ", artist=" + artist +
                '}';
    }
}

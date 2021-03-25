package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "artist_genre")
public class ArtistGenre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer artistGenreId;
    Integer artistId;
    Integer genreId;

    public ArtistGenre(){}

    public ArtistGenre(Integer artistId, Integer genreId) {
        this.artistId = artistId;
        this.genreId = genreId;
    }

    public Integer getArtistGenreId() {
        return artistGenreId;
    }

    public void setArtistGenreId(Integer artistGenreId) {
        this.artistGenreId = artistGenreId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArtistGenre that = (ArtistGenre) o;
        return Objects.equals(artistGenreId, that.artistGenreId) && Objects.equals(artistId, that.artistId) && Objects.equals(genreId, that.genreId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistGenreId, artistId, genreId);
    }

    @Override
    public String toString() {
        return "ArtistGenre{" +
                "artistGenreId=" + artistGenreId +
                ", artistId=" + artistId +
                ", genreId=" + genreId +
                '}';
    }
}

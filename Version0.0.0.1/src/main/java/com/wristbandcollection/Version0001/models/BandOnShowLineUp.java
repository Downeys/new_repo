package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "band_on_show_line_up")
public class BandOnShowLineUp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lineUpId;
    private Integer showId;
    private Integer artistId;

    public BandOnShowLineUp(){}

    public BandOnShowLineUp(Integer showId, Integer artistId) {
        this.showId = showId;
        this.artistId = artistId;
    }

    public Integer getLineUpId() {
        return lineUpId;
    }

    public void setLineUpId(Integer lineUpId) {
        this.lineUpId = lineUpId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BandOnShowLineUp that = (BandOnShowLineUp) o;
        return Objects.equals(lineUpId, that.lineUpId) && Objects.equals(showId, that.showId) && Objects.equals(artistId, that.artistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineUpId, showId, artistId);
    }

    @Override
    public String toString() {
        return "BandOnShowLineUp{" +
                "lineUpId=" + lineUpId +
                ", showId=" + showId +
                ", artistId=" + artistId +
                '}';
    }
}

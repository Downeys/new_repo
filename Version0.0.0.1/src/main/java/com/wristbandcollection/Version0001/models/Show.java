package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "show")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer showId;
    private Integer venueId;
    private LocalDate showDate;
    @OneToMany
    @JoinColumn(name = "showId", referencedColumnName = "showId", nullable = false, insertable = false)
    private List<BandOnShowLineUp> lineup;

    public Show(){}

    public Show(LocalDate showDate, List<BandOnShowLineUp> lineup) {
        this.showDate = showDate;
        this.lineup = lineup;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public List<BandOnShowLineUp> getLineup() {
        return lineup;
    }

    public void setLineup(List<BandOnShowLineUp> lineup) {
        this.lineup = lineup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(showId, show.showId) && Objects.equals(venueId, show.venueId) && Objects.equals(showDate, show.showDate) && Objects.equals(lineup, show.lineup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showId, venueId, showDate, lineup);
    }

    @Override
    public String toString() {
        return "Show{" +
                "showId=" + showId +
                ", venueId=" + venueId +
                ", showDate=" + showDate +
                ", lineup=" + lineup +
                '}';
    }
}

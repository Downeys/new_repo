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
    private LocalDate showDate;

    @ManyToMany //checked
    @JoinTable(
            name = "show_lineup",
            joinColumns = @JoinColumn(name = "showId"),
            inverseJoinColumns = @JoinColumn(name = "artistId")
    )
    private List<Artist> lineup;

    @ManyToOne //checked
    @JoinColumn(name = "venueId", referencedColumnName = "venueId")
    private Venue venue;

    public Show(){}

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public List<Artist> getLineup() {
        return lineup;
    }

    public void setLineup(List<Artist> lineup) {
        this.lineup = lineup;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(showId, show.showId) && Objects.equals(showDate, show.showDate) && Objects.equals(lineup, show.lineup) && Objects.equals(venue, show.venue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showId, showDate, lineup, venue);
    }

    @Override
    public String toString() {
        return "Show{" +
                "showId=" + showId +
                ", showDate=" + showDate +
                ", lineup=" + lineup +
                ", venue=" + venue +
                '}';
    }
}

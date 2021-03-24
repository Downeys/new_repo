package com.wristbandcollection.Version0001.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Show {
    private Integer showId;
    private LocalDate showDate;
    private List<Artist> lineup;

    public Show(){}

    public Show(LocalDate showDate, List<Artist> lineup) {
        this.showDate = showDate;
        this.lineup = lineup;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return Objects.equals(showId, show.showId) && Objects.equals(showDate, show.showDate) && Objects.equals(lineup, show.lineup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showId, showDate, lineup);
    }

    @Override
    public String toString() {
        return "Show{" +
                "showId=" + showId +
                ", showDate=" + showDate +
                ", lineup=" + lineup +
                '}';
    }
}

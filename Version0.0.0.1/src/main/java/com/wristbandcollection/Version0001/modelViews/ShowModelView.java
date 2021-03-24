package com.wristbandcollection.Version0001.modelViews;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class ShowModelView {
    private Integer showId;
    private LocalDate showDate;
    private List<ArtistModelView> lineup;

    public ShowModelView(){}

    public ShowModelView(LocalDate showDate, List<ArtistModelView> lineup) {
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

    public List<ArtistModelView> getLineup() {
        return lineup;
    }

    public void setLineup(List<ArtistModelView> lineup) {
        this.lineup = lineup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowModelView showModelView = (ShowModelView) o;
        return Objects.equals(showId, showModelView.showId) && Objects.equals(showDate, showModelView.showDate) && Objects.equals(lineup, showModelView.lineup);
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

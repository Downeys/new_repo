package com.wristbandcollection.Version0001.modelViews;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class AlbumModelView {
    private Integer albumId;
    private String albumTitle;
    private RecordingStudioModelView recordingStudioModelView;
    private List<SongModelView> trackList;
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

    public RecordingStudioModelView getRecordingStudio() {
        return recordingStudioModelView;
    }

    public void setRecordingStudio(RecordingStudioModelView recordingStudioModelView) {
        this.recordingStudioModelView = recordingStudioModelView;
    }

    public List<SongModelView> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<SongModelView> trackList) {
        this.trackList = trackList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumModelView albumModelView = (AlbumModelView) o;
        return Objects.equals(albumId, albumModelView.albumId) && Objects.equals(albumTitle, albumModelView.albumTitle) && Objects.equals(recordingStudioModelView, albumModelView.recordingStudioModelView) && Objects.equals(trackList, albumModelView.trackList) && Objects.equals(price, albumModelView.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, albumTitle, recordingStudioModelView, trackList, price);
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", albumTitle='" + albumTitle + '\'' +
                ", recordingStudio=" + recordingStudioModelView +
                ", trackList=" + trackList +
                ", price=" + price +
                '}';
    }
}

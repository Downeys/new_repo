package com.wristbandcollection.Version0001.modelViews;

import java.time.LocalDate;
import java.util.List;

public class ArtistModelView {
    private Integer artistId;
    private String bandName;
    private List<GenreModelView> genreModelViews;
    private List<BandMemberModelView> bandMemberModelViews;
    private HometownModelView hometownModelView;
    private List<AlbumModelView> albumModelViews;
    private LocalDate dateBandFormed;
    private LocalDate dateBandBrokeUp;
    private WebListingModelView webListingModelView;
}

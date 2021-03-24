package com.wristbandcollection.Version0001.models;

import java.util.Objects;

public class Genre {
    private Integer genreId;
    private String name;
    private String description;
    private Integer artistId;

    public Genre(){}

    public Genre(String name) {
        this.name = name;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

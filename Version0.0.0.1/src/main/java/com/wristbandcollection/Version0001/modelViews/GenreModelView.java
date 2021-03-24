package com.wristbandcollection.Version0001.modelViews;

import java.util.Objects;

public class GenreModelView {
    private Integer genreId;
    private String name;
    private String description;

    public GenreModelView(){}

    public GenreModelView(String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreModelView genreModelView = (GenreModelView) o;
        return Objects.equals(genreId, genreModelView.genreId) && Objects.equals(name, genreModelView.name) && Objects.equals(description, genreModelView.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, name, description);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

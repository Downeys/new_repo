package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer genreId;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "genres") //checked
    private List<Artist> artists;

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

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return Objects.equals(genreId, genre.genreId) && Objects.equals(name, genre.name) && Objects.equals(description, genre.description) && Objects.equals(artists, genre.artists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, name, description, artists);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreId=" + genreId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", artists=" + artists +
                '}';
    }
}

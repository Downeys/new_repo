package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "venue")
public class WebListing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer websiteListingId;
    private Integer ownerId;
    private String website;
    private String facebook;
    private String instagram;
    private String twitter;
    private String bandcamp;
    private String reverbNation;
    private String soundcloud;
    private String bandsInTown;

    public WebListing() {
    }

    public Integer getWebsiteListingId() {
        return websiteListingId;
    }

    public void setWebsiteListingId(Integer websiteListingId) {
        this.websiteListingId = websiteListingId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getBandcamp() {
        return bandcamp;
    }

    public void setBandcamp(String bandcamp) {
        this.bandcamp = bandcamp;
    }

    public String getReverbNation() {
        return reverbNation;
    }

    public void setReverbNation(String reverbNation) {
        this.reverbNation = reverbNation;
    }

    public String getSoundcloud() {
        return soundcloud;
    }

    public void setSoundcloud(String soundcloud) {
        this.soundcloud = soundcloud;
    }

    public String getBandsInTown() {
        return bandsInTown;
    }

    public void setBandsInTown(String bandsInTown) {
        this.bandsInTown = bandsInTown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebListing that = (WebListing) o;
        return Objects.equals(websiteListingId, that.websiteListingId) && Objects.equals(ownerId, that.ownerId) && Objects.equals(website, that.website) && Objects.equals(facebook, that.facebook) && Objects.equals(instagram, that.instagram) && Objects.equals(twitter, that.twitter) && Objects.equals(bandcamp, that.bandcamp) && Objects.equals(reverbNation, that.reverbNation) && Objects.equals(soundcloud, that.soundcloud) && Objects.equals(bandsInTown, that.bandsInTown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(websiteListingId, ownerId, website, facebook, instagram, twitter, bandcamp, reverbNation, soundcloud, bandsInTown);
    }

    @Override
    public String toString() {
        return "WebListing{" +
                "websiteListingsId=" + websiteListingId +
                ", ownerId=" + ownerId +
                ", website='" + website + '\'' +
                ", facebook='" + facebook + '\'' +
                ", instagram='" + instagram + '\'' +
                ", twitter='" + twitter + '\'' +
                ", bandcamp='" + bandcamp + '\'' +
                ", reverbNation='" + reverbNation + '\'' +
                ", soundcloud='" + soundcloud + '\'' +
                ", bandsInTown='" + bandsInTown + '\'' +
                '}';
    }
}

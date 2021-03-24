package com.wristbandcollection.Version0001.modelViews;

import java.util.Objects;

public class WebListingModelView {
    private Integer websiteListingsId;
    private String website;
    private String facebook;
    private String instagram;
    private String twitter;
    private String bandcamp;
    private String reverbNation;
    private String soundcloud;

    public WebListingModelView() {
    }

    public Integer getWebsiteListingsId() {
        return websiteListingsId;
    }

    public void setWebsiteListingsId(Integer websiteListingsId) {
        this.websiteListingsId = websiteListingsId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebListingModelView that = (WebListingModelView) o;
        return Objects.equals(websiteListingsId, that.websiteListingsId) && Objects.equals(website, that.website) && Objects.equals(facebook, that.facebook) && Objects.equals(instagram, that.instagram) && Objects.equals(twitter, that.twitter) && Objects.equals(bandcamp, that.bandcamp) && Objects.equals(reverbNation, that.reverbNation) && Objects.equals(soundcloud, that.soundcloud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(websiteListingsId, website, facebook, instagram, twitter, bandcamp, reverbNation, soundcloud);
    }

    @Override
    public String toString() {
        return "WebsiteListings{" +
                "websiteListingsId=" + websiteListingsId +
                ", website='" + website + '\'' +
                ", facebook='" + facebook + '\'' +
                ", instagram='" + instagram + '\'' +
                ", twitter='" + twitter + '\'' +
                ", bandcamp='" + bandcamp + '\'' +
                ", reverbNation='" + reverbNation + '\'' +
                ", soundcloud='" + soundcloud + '\'' +
                '}';
    }
}

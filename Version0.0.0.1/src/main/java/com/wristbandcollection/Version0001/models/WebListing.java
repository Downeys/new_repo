package com.wristbandcollection.Version0001.models;

import java.util.Objects;

public class WebListing {
    private Integer websiteListingsId;
    private String website;
    private String facebook;
    private String instagram;
    private String twitter;
    private String bandcamp;
    private String reverbNation;
    private String soundcloud;
    private Integer artistId;

    public WebListing() {
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

}

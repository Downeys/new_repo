package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "band_member")
public class BandMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bandMemberId;
    private String name;
    @OneToOne
    @JoinColumn(name = "bandMemberId", referencedColumnName = "bandMemberId", nullable = false, updatable = false)
    private Hometown hometown;
    private Integer contactCardId;
    @OneToOne
    @JoinColumn(name = "bandMemberId", referencedColumnName = "bandMemberId", nullable = false, updatable = false)
    private ContactCard contactCard;
    private Integer artistId;

    public BandMember(){}

}

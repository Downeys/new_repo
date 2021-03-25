package com.wristbandcollection.Version0001.service;

import com.wristbandcollection.Version0001.dao.*;
import com.wristbandcollection.Version0001.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceLayer {

    private AddressDao addressRepo;
    private AlbumDao albumRepo;
    private ArtistDao artistRepo;
    private ArtistGenreDao artistGenreRepo;
    private BandMemberDao bandMemberRepo;
    private BandOnShowLineUpDao bandOnShowLineUpRepo;
    private ContactCardDao contactCardRepo;
    private GenreDao genreRepo;
    private HometownDao hometownRepo;
    private RecordingStudioDao recordingStudioRepo;
    private ShowDao showRepo;
    private SongDao songRepo;
    private VenueDao venueRepo;
    private WebListingDao webListingRepo;

    @Autowired
    public ServiceLayer(AddressDao addressRepo, AlbumDao albumRepo, ArtistDao artistRepo, ArtistGenreDao artistGenreRepo,
                        BandMemberDao bandMemberRepo, BandOnShowLineUpDao bandOnShowLineUpRepo, ContactCardDao contactCardRepo,
                        GenreDao genreRepo, HometownDao hometownRepo, RecordingStudioDao recordingStudioRepo, ShowDao showRepo,
                        SongDao songRepo, VenueDao venueRepo, WebListingDao webListingRepo){
        this.addressRepo = addressRepo;
        this. albumRepo = albumRepo;
        this.artistRepo = artistRepo;
        this.artistGenreRepo = artistGenreRepo;
        this.bandMemberRepo = bandMemberRepo;
        this.bandOnShowLineUpRepo = bandOnShowLineUpRepo;
        this.contactCardRepo = contactCardRepo;
        this.genreRepo = genreRepo;
        this.hometownRepo = hometownRepo;
        this. recordingStudioRepo = recordingStudioRepo;
        this.showRepo = showRepo;
        this.songRepo = songRepo;
        this.venueRepo = venueRepo;
        this.webListingRepo = webListingRepo;
    }

    //Address

    @Transactional
    public Address saveAddress(Address address){
        return addressRepo.save(address);
    }

    public Address findAddress(int id){
        return addressRepo.getOne(id);
    }

    public List<Address> findAllAddresses(){
        return addressRepo.findAll();
    }

    @Transactional
    public void updateAddress(Address address){
        Address updatedAddress = addressRepo.getOne(address.getAddressId());
        updatedAddress.setStreet1(address.getStreet1());
        updatedAddress.setStreet2(address.getStreet2());
        updatedAddress.setCity(address.getCity());
        updatedAddress.setState(address.getState());
        updatedAddress.setZipCode(address.getZipCode());
        addressRepo.save(updatedAddress);
    }

    @Transactional
    public void deleteAddress(int id){
        addressRepo.deleteById(id);
    }

    //Album

    @Transactional
    public Album saveAlbum(Album album){
        return albumRepo.save(album);
    }

    public Album findAlbum(int id){
        return albumRepo.getOne(id);
    }

    public List<Album> findAllAlbums(){
        return albumRepo.findAll();
    }

    @Transactional
    public Album updateAlbum(Album album){
        Album updatedAlbum = albumRepo.getOne(album.getAlbumId());
        updatedAlbum.setAlbumTitle(album.getAlbumTitle());
        updatedAlbum.setArtistId(album.getArtistId());
        updatedAlbum.setPrice(album.getPrice());
        updatedAlbum.setReleaseDate(album.getReleaseDate());
        updatedAlbum.setStudioId(album.getStudioId());
        updatedAlbum.setTrackList(album.getTrackList());
        return albumRepo.save(updatedAlbum);
    }

    @Transactional
    public void deleteAlbum(int id){
        albumRepo.deleteById(id);
    }

    //Artist

    @Transactional
    public Artist saveArtist(Artist artist){
        return artistRepo.save(artist);
    }

    public Artist findArtist(int id){
        return artistRepo.getOne(id);
    }

    public List<Artist> findAllArtists(){
        return artistRepo.findAll();
    }

    @Transactional
    public Artist updateArtist(Artist artist){
        Artist updatedArtist = artistRepo.getOne(artist.getArtistId());
        updatedArtist.setAlbums(artist.getAlbums());
        updatedArtist.setBandMemberId(artist.getBandMemberId());
        updatedArtist.setBandMembers(artist.getBandMembers());
        updatedArtist.setBandName(artist.getBandName());
        updatedArtist.setDateBandBrokeUp(artist.getDateBandBrokeUp());
        updatedArtist.setDateBandFormed(artist.getDateBandFormed());
        updatedArtist.setGenres(artist.getGenres());
        updatedArtist.setHometown(artist.getHometown());
        updatedArtist.setShows(artist.getShows());
        updatedArtist.setWebListing(artist.getWebListing());
        return artistRepo.save(updatedArtist);
    }

    @Transactional
    public void deleteArtist(int id){
        artistRepo.deleteById(id);
    }

    //Artist Genre

    @Transactional
    public ArtistGenre saveArtistGenre(ArtistGenre artistGenre){
        return artistGenreRepo.save(artistGenre);
    }

    public ArtistGenre findArtistGenre(int id){
        return artistGenreRepo.getOne(id);
    }

    public List<ArtistGenre> findAllArtistGenres(){
        return artistGenreRepo.findAll();
    }

    @Transactional
    public ArtistGenre updateArtistGenre(ArtistGenre artistGenre){
        ArtistGenre updatedArtistGenre = artistGenreRepo.getOne(artistGenre.getArtistGenreId());
        updatedArtistGenre.setArtistId(artistGenre.getArtistId());
        updatedArtistGenre.setGenreId(artistGenre.getGenreId());
        return artistGenreRepo.save(updatedArtistGenre);
    }

    @Transactional
    public void deleteArtistGenre(int id){
        artistGenreRepo.deleteById(id);
    }

    //Band Member


    @Transactional
    public BandMember saveBandMember(BandMember bandMember){
        return bandMemberRepo.save(bandMember);
    }

    public BandMember findBandMember(int id){
        return bandMemberRepo.getOne(id);
    }

    public List<BandMember> findAllBandMembers(){
        return bandMemberRepo.findAll();
    }

    @Transactional
    public BandMember updateBandMember(BandMember bandMember){
        BandMember updatedBandMember = bandMemberRepo.getOne(bandMember.getBandMemberId());
        updatedBandMember.setArtistId(bandMember.getArtistId());
        updatedBandMember.setBands(bandMember.getBands());
        updatedBandMember.setHometown(bandMember.getHometown());
        updatedBandMember.setContactCard(bandMember.getContactCard());
        updatedBandMember.setHometownId(bandMember.getHometownId());
        updatedBandMember.setName(bandMember.getName());
        return bandMemberRepo.save(updatedBandMember);
    }

    @Transactional
    public void deleteBandMember(int id){
        bandMemberRepo.deleteById(id);
    }

    //Band On Show Line Up


    @Transactional
    public BandOnShowLineUp saveBandOnShowLineUp(BandOnShowLineUp bandOnShowLineUp){
        return bandOnShowLineUpRepo.save(bandOnShowLineUp);
    }

    public BandOnShowLineUp findBandOnShowLineUp(int id){
        return bandOnShowLineUpRepo.getOne(id);
    }

    public List<BandOnShowLineUp> findAllBandOnShowLineUps(){
        return bandOnShowLineUpRepo.findAll();
    }

    @Transactional
    public BandOnShowLineUp updateBandOnShowLineUp(BandOnShowLineUp bandOnShowLineUp){
        BandOnShowLineUp updatedBandOnShowLineUp = bandOnShowLineUpRepo.getOne(bandOnShowLineUp.getLineUpId());
        updatedBandOnShowLineUp.setShowId(bandOnShowLineUp.getShowId());
        updatedBandOnShowLineUp.setArtistId(bandOnShowLineUp.getArtistId());
        return bandOnShowLineUpRepo.save(updatedBandOnShowLineUp);
    }

    @Transactional
    public void deleteBandOnShowLineUp(int id){
        bandOnShowLineUpRepo.deleteById(id);
    }

    //Contact Card


    @Transactional
    public ContactCard saveContactCard(ContactCard contactCard){
        return contactCardRepo.save(contactCard);
    }

    public ContactCard findContactCard(int id){
        return contactCardRepo.getOne(id);
    }

    public List<ContactCard> findAllContactCards(){
        return contactCardRepo.findAll();
    }

    @Transactional
    public ContactCard updateContactCard(ContactCard contactCard){
        ContactCard updatedContactCard = contactCardRepo.getOne(contactCard.getContactCardId());
        return contactCardRepo.save(updatedContactCard);
    }

    @Transactional
    public void deleteContactCard(int id){
        contactCardRepo.deleteById(id);
    }

    //Genre

    @Transactional
    public Genre saveGenre(Genre genre){
        return genreRepo.save(genre);
    }

    public Genre findGenre(int id){
        return genreRepo.getOne(id);
    }

    public List<Genre> findAllGenres(){
        return genreRepo.findAll();
    }

    @Transactional
    public Genre updateGenre(Genre genre){
        Genre updatedGenre = genreRepo.getOne(genre.getGenreId());
        updatedGenre.setName(genre.getName());
        updatedGenre.setDescription(genre.getDescription());
        return genreRepo.save(updatedGenre);
    }

    @Transactional
    public void deleteGenre(int id){
        genreRepo.deleteById(id);
    }

    //Hometown


    @Transactional
    public Hometown saveHometown(Hometown hometown){
        return hometownRepo.save(hometown);
    }

    public Hometown findHometown(int id){
        return hometownRepo.getOne(id);
    }

    public List<Hometown> findAllHometowns(){
        return hometownRepo.findAll();
    }

    @Transactional
    public Hometown updateHometown(Hometown hometown){
        Hometown updatedHometown = hometownRepo.getOne(hometown.getHometownId());
        updatedHometown.setHometownName(hometown.getHometownName());
        updatedHometown.setBandsFromHometown(hometown.getBandsFromHometown());
        updatedHometown.setBandMembersFromHometown(hometown.getBandMembersFromHometown());
        updatedHometown.setOwnerId(hometown.getOwnerId());
        updatedHometown.setOwnerType(hometown.getOwnerType());
        return hometownRepo.save(updatedHometown);
    }

    @Transactional
    public void deleteHometown(int id){
        hometownRepo.deleteById(id);
    }

    //Recording Studio

    @Transactional
    public RecordingStudio saveRecordingStudio(RecordingStudio recordingStudio){
        return recordingStudioRepo.save(recordingStudio);
    }

    public RecordingStudio findRecordingStudio(int id){
        return recordingStudioRepo.getOne(id);
    }

    public List<RecordingStudio> findAllRecordingStudios(){
        return recordingStudioRepo.findAll();
    }

    @Transactional
    public RecordingStudio updateRecordingStudio(RecordingStudio recordingStudio){
        RecordingStudio updatedRecordingStudio = recordingStudioRepo.getOne(recordingStudio.getRecordingStudioId());
        updatedRecordingStudio.setName(recordingStudio.getName());
        updatedRecordingStudio.setContactCard(recordingStudio.getContactCard());
        updatedRecordingStudio.setAddress(recordingStudio.getAddress());
        return recordingStudioRepo.save(updatedRecordingStudio);
    }

    @Transactional
    public void deleteRecordingStudio(int id){
        recordingStudioRepo.deleteById(id);
    }

    //Show

    @Transactional
    public Show saveShow(Show show){
        return showRepo.save(show);
    }

    public Show findShow(int id){
        return showRepo.getOne(id);
    }

    public List<Show> findAllShows(){
        return showRepo.findAll();
    }

    @Transactional
    public Show updateShow(Show show){
        Show updatedShow = showRepo.getOne(show.getShowId());
        return showRepo.save(updatedShow);
    }

    @Transactional
    public void deleteShow(int id){
        showRepo.deleteById(id);
    }

    //Song


    @Transactional
    public Song saveSong(Song song){
        return songRepo.save(song);
    }

    public Song findSong(int id){
        return songRepo.getOne(id);
    }

    public List<Song> findAllSongs(){
        return songRepo.findAll();
    }

    @Transactional
    public Song updateSong(Song song){
        Song updatedSong = songRepo.getOne(song.getSongId());
        updatedSong.setAlbumId(song.getAlbumId());
        updatedSong.setRuntime(song.getRuntime());
        updatedSong.setTrackNumber(song.getTrackNumber());
        updatedSong.setTrackTitle(song.getTrackTitle());
        return songRepo.save(updatedSong);
    }

    @Transactional
    public void deleteSong(int id){
        songRepo.deleteById(id);
    }

    //Venue

    @Transactional
    public Venue saveVenue(Venue venue){
        return venueRepo.save(venue);
    }

    public Venue findVenue(int id){
        return venueRepo.getOne(id);
    }

    public List<Venue> findAllVenues(){
        return venueRepo.findAll();
    }

    @Transactional
    public Venue updateVenue(Venue venue){
        Venue updatedVenue = venueRepo.getOne(venue.getVenueId());
        updatedVenue.setAddress(venue.getAddress());
        updatedVenue.setName(venue.getName());
        updatedVenue.setShows(venue.getShows());
        updatedVenue.setWebListing(venue.getWebListing());
        updatedVenue.setContactCards(venue.getContactCards());
        updatedVenue.setDateOpened(venue.getDateOpened());
        updatedVenue.setDateClosed(venue.getDateClosed());
        return venueRepo.save(updatedVenue);
    }

    @Transactional
    public void deleteVenue(int id){
        venueRepo.deleteById(id);
    }

    //Website Listings

    @Transactional
    public WebListing saveWebListing(WebListing webListing){
        return webListingRepo.save(webListing);
    }

    public WebListing findWebListing(int id){
        return webListingRepo.getOne(id);
    }

    public List<WebListing> findAllWebListings(){
        return webListingRepo.findAll();
    }

    @Transactional
    public WebListing updateWebListing(WebListing webListing){
        WebListing updatedWebListing = webListingRepo.getOne(webListing.getWebsiteListingId());
        updatedWebListing.setWebsite(webListing.getWebsite());
        updatedWebListing.setFacebook(webListing.getFacebook());
        updatedWebListing.setInstagram(webListing.getInstagram());
        updatedWebListing.setTwitter(webListing.getTwitter());
        updatedWebListing.setBandcamp(webListing.getBandcamp());
        updatedWebListing.setReverbNation(webListing.getReverbNation());
        updatedWebListing.setSoundcloud(webListing.getSoundcloud());
        updatedWebListing.setBandsInTown(webListing.getBandsInTown());
        return webListingRepo.save(updatedWebListing);
    }

    @Transactional
    public void deleteWebListing(int id){
        webListingRepo.deleteById(id);
    }
}

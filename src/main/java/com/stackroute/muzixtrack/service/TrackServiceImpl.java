package com.stackroute.muzixtrack.service;

import com.stackroute.muzixtrack.domain.Track;
import com.stackroute.muzixtrack.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class TrackServiceImpl implements TrackService{
 private TrackRepository trackRepository;

@Autowired
  public TrackServiceImpl(TrackRepository trackRepository) {
    this.trackRepository = trackRepository;
  }

  @Override
  public Track save(Track track) {
  Track savedTrack=trackRepository.save(track);
    return savedTrack;
  }

  @Override
  public Track getById(int id) {
  Track retriveTrack=trackRepository.findById(id).get();
    return retriveTrack;
  }

 /* @Override
  public List<Track> getAllTracks(Track track) {
Track getAllTracks=trackRepository.().get();
return getAllTracks;
  }

  @Override
  public Track deleteTrackById(int id) {
  Track deleteTrack=trackRepository.deleteById(id).;
    return null;
  }

  @Override
  public Track updateTrack(Track track) {
  Track updateTrack=trackRepository.
    return updateTrack;
  }*/
}

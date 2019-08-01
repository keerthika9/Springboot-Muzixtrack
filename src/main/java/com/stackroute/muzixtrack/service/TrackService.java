package com.stackroute.muzixtrack.service;

import com.stackroute.muzixtrack.domain.Track;

import java.util.List;

public interface TrackService {
  public Track save(Track track);
  public Track getById(int id);
  /*public List<Track> getAllTracks(Track track);
  public Track deleteTrackById(int id);
  public Track updateTrack(Track track);*/
}

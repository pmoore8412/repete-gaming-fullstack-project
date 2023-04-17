package com.vlog.repetegaming.service.videodetails;

import java.util.List;

import com.vlog.repetegaming.entity.VideoDetails;

public interface VideoDetailsService {

    VideoDetails addNewVideo(VideoDetails video);

    List<VideoDetails> getAllVideos();

    void removeVideo(String id);
    
}

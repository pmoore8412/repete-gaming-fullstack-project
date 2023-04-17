package com.vlog.repetegaming.service.videodetails;

import java.util.List;

import com.vlog.repetegaming.entity.VideoDetails;

public interface VideoDetailsService {

    VideoDetails addNewVideo(VideoDetails video);

    List<VideoDetails> getAllVideos();

    VideoDetails getVideo(String id);

    void removeVideo(String id);
    
}

package com.vlog.repetegaming.service.videodetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlog.repetegaming.entity.VideoDetails;
import com.vlog.repetegaming.repository.VideoDetailsRepository;

@Service
public class VideoDetailsServiceImpl implements VideoDetailsService {

    @Autowired
    VideoDetailsRepository videoDetailsRepository;

    @Override
    public VideoDetails addNewVideo(VideoDetails video) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNewVideo'");
    }

    @Override
    public List<VideoDetails> getAllVideos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllVideos'");
    }

    @Override
    public void removeVideo(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeVideo'");
    }
    
}

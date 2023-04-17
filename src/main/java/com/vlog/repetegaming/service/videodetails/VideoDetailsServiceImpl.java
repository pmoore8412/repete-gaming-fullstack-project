package com.vlog.repetegaming.service.videodetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.vlog.repetegaming.entity.Comments;
import com.vlog.repetegaming.entity.VideoDetails;
import com.vlog.repetegaming.repository.CommentsRepository;
import com.vlog.repetegaming.repository.VideoDetailsRepository;

@Service
public class VideoDetailsServiceImpl implements VideoDetailsService {

    @Autowired
    VideoDetailsRepository videoDetailsRepository;

    @Autowired
    CommentsRepository commentsRepository;

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
        
        VideoDetails videoDetails = videoDetailsRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
        "No video found with id: " + id));

        Comments comments = commentsRepository.findByVideoId(id);

        videoDetailsRepository.delete(videoDetails);
        commentsRepository.delete(comments);

    }

    @Override
    public VideoDetails getVideo(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVideo'");
    }
    
}

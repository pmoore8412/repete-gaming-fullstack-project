package com.vlog.repetegaming.service.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlog.repetegaming.entity.Comments;
import com.vlog.repetegaming.repository.CommentsRepository;

@Service
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    CommentsRepository commentsRepository;

    @Override
    public Comments addComment(Comments comment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addComment'");
    }

    @Override
    public Comments editComment(String id, Comments comment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editComment'");
    }

    @Override
    public void removeComment(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeComment'");
    }

    
    
}

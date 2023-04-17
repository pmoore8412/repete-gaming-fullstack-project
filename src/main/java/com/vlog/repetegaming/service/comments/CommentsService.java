package com.vlog.repetegaming.service.comments;

import com.vlog.repetegaming.entity.Comments;

public interface CommentsService {

    Comments addComment(Comments comment);

    Comments editComment(String id, Comments comment);

    void removeComment(String id);
    
}

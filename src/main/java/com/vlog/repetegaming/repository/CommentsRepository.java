package com.vlog.repetegaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlog.repetegaming.entity.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, String> {

    Comments findByVideoId(String videoId);
    
}

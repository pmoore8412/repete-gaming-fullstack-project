package com.vlog.repetegaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlog.repetegaming.entity.VideoDetails;

@Repository
public interface VideoDetailsRepository extends JpaRepository<VideoDetails, String> {
    
}

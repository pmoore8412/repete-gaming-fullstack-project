package com.vlog.repetegaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vlog.repetegaming.entity.Subscriber;

@Repository
public interface SubscriberRepository extends JpaRepository<Subscriber, String> {

    Subscriber findByEmail(String email);

    Subscriber findByUserName(String userName);
    
}

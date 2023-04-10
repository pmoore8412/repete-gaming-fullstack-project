package com.vlog.repetegaming.service.subscriber;

import java.util.List;

import com.vlog.repetegaming.dto.SubscriberDto;
import com.vlog.repetegaming.entity.Subscriber;

public interface SubscriberService {

    Subscriber newSubscriber(Subscriber subscriber);

    List<SubscriberDto> listAllSubscribers();

    SubscriberDto login(String email, String password);

    void removeSubscriber(String id);
    
}

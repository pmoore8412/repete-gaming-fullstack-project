package com.vlog.repetegaming.service.subscriber;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.vlog.repetegaming.dto.SubscriberDto;
import com.vlog.repetegaming.entity.Subscriber;
import com.vlog.repetegaming.repository.SubscriberRepository;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    @Autowired
    SubscriberRepository subRepo;

    @Override
    public Subscriber newSubscriber(Subscriber subscriber) {

        Optional<Subscriber> newSub = Optional.ofNullable(subRepo.findByEmail(subscriber.getEmail()));
        if(newSub.isPresent())
            throw new ResponseStatusException(HttpStatus.FOUND,
            "Subscriber with email " + subscriber.getEmail() + " already exists");

        return subRepo.save(subscriber);

    }

    @Override
    public List<SubscriberDto> listAllSubscribers() {
        return ((List<Subscriber>) subRepo.findAll()).stream().map(this::convertToSubscriberDto).collect(Collectors.toList());
    }


    private SubscriberDto convertToSubscriberDto(Subscriber subscriber) {
        SubscriberDto subscriberDto = new SubscriberDto();

        subscriberDto.setId(subscriber.getId());
        subscriberDto.setUserName(subscriber.getUserName());
        subscriberDto.setAdmin(subscriber.isAdmin());

        return subscriberDto;
    }

    @Override
    public SubscriberDto login(String email, String password) {

        Optional<Subscriber> athorizedUser = Optional.ofNullable(subRepo.findByEmail(email));
        SubscriberDto subscriber = new SubscriberDto();

        if(athorizedUser.isPresent())
            if(password.equals(athorizedUser.get().getPassword())) {
                subscriber.setId(athorizedUser.get().getId());
                subscriber.setUserName(athorizedUser.get().getUserName());
                subscriber.setAdmin(athorizedUser.get().isAdmin());
            }

        return subscriber;

    }

    @Override
    public void removeSubscriber(String id) {

        Subscriber subscriber = subRepo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
        "No subscriber found with id: " + id));

        subRepo.delete(subscriber);

    }
    
}

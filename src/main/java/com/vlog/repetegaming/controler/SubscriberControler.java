package com.vlog.repetegaming.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vlog.repetegaming.dto.SubscriberDto;
import com.vlog.repetegaming.entity.Subscriber;
import com.vlog.repetegaming.service.subscriber.SubscriberService;

@RestController
@RequestMapping("/subscriber")
@CrossOrigin
public class SubscriberControler {

    @Autowired
    SubscriberService subService;

    @PostMapping("/new")
    public Subscriber newSubscriber(@RequestBody Subscriber subscriber) {

        return subService.newSubscriber(subscriber);

    }

    @GetMapping("/list-all")
    public List<SubscriberDto> listAllSubscribers() {

        return subService.listAllSubscribers();

    }

    @PostMapping("/login")
    public SubscriberDto login(@RequestHeader(name = "email") String email, @RequestHeader(name = "password") String password) {

        return subService.login(email, password);

    }

    @DeleteMapping("/remove/{id}")
    public void removeSubscriber(@PathVariable(name = "id") String id) {

        subService.removeSubscriber(id);

    }
    
}

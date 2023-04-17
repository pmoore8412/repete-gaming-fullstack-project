package com.vlog.repetegaming.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vlog.repetegaming.service.comments.CommentsService;

@RestController
@RequestMapping("/comments")
@CrossOrigin
public class CommentsControler {

    @Autowired
    CommentsService commentsService;
    
}

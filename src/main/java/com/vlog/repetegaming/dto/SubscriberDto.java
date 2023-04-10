package com.vlog.repetegaming.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SubscriberDto {
    
    private String id;
    private String userName;
    private boolean isAdmin;

}

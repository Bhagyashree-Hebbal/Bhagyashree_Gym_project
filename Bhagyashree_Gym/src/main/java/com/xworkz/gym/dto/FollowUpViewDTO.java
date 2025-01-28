package com.xworkz.gym.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FollowUpViewDTO {
    private int followUpViewId;
    private String name;
    private String area;
    private long phoneNo;
    private String reasons;
}

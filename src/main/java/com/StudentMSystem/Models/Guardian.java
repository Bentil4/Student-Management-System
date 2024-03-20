package com.StudentMSystem.Models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Guardian {
    private String name;
    private String relationship;
    private String contact;
}

package com.StudentMSystem.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String residence;
    private String location;
}

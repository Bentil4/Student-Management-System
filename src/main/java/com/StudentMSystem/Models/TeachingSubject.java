package com.StudentMSystem.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeachingSubject {
    private String subjectCode;
    private String subjectName;
}

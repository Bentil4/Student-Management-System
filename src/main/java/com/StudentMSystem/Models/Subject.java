package com.StudentMSystem.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Subject {
    private String subjectID;
    private String subjectName;
    private Integer classScore;
    private Integer examScore;
    private Integer totalScore;
}

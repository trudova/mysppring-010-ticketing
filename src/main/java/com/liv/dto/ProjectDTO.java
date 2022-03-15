package com.liv.dto;

import com.liv.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProjectDTO {
    private String projectName, projectCode,projDetail;
    private UserDTO manager;
    private LocalDate startDate, endDate;
    private Status projectStatus;

}

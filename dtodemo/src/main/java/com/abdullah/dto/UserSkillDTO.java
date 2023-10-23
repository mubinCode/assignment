package com.abdullah.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class UserSkillDTO {
    private String name;
    private String email;
    private String language;
    private double experience;
}

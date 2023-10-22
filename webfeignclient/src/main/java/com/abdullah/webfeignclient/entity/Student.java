package com.abdullah.webfeignclient.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Student {


    private Long id;
    private String studentName;
    private String dept;
    
}

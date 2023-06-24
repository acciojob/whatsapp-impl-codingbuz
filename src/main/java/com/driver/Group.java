package com.driver;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Group {
    private String name;
    private int numberOfParticipants;

    public Group(){

    }

}

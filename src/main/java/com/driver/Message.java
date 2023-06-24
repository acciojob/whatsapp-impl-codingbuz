package com.driver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
public class Message {
    private int id;
    private String content;
    private Date timestamp;

    public Message(){}

}

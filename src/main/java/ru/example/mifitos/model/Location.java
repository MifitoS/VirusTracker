package ru.example.mifitos.model;

import lombok.Data;

@Data
public class Location {

    private String state;
    private String country;
    private Integer latestTotalCases;
}

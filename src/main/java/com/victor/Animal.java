package com.victor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Data
public class Animal {
    private final String name;
    private final String kind;
    private Double weight;
}

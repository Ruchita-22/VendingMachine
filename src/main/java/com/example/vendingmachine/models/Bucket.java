package com.example.vendingmachine.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Bucket<E1, E2> {
    private E1 first;
    private E2 second;
}

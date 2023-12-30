package com.example.vendingmachine.controller;

import com.example.vendingmachine.models.Bucket;
import com.example.vendingmachine.models.enums.Coin;
import com.example.vendingmachine.models.enums.Item;

import java.util.List;

public interface VendingMachine {
    public long selectItemAndGetPrice(Item item);
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChange();
    public void reset();
}

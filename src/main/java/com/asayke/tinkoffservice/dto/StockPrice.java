package com.asayke.tinkoffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class StockPrice {
    String figi;
    Double price;
}
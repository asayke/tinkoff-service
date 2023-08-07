package com.asayke.tinkoffservice.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
public class StocksPricesDto {
  List<StockPrice> prices;
}
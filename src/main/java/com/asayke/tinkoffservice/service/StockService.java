package com.asayke.tinkoffservice.service;

import com.asayke.tinkoffservice.dto.FigiesDto;
import com.asayke.tinkoffservice.dto.StocksDto;
import com.asayke.tinkoffservice.dto.StocksPricesDto;
import com.asayke.tinkoffservice.dto.TickersDto;
import com.asayke.tinkoffservice.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
    StocksDto getStocksByTickers(TickersDto tickers);
    StocksPricesDto getPricesStocksByFigies(FigiesDto figiesDto);
}
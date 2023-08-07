package com.asayke.tinkoffservice.controller;


import com.asayke.tinkoffservice.dto.FigiesDto;
import com.asayke.tinkoffservice.dto.StocksDto;
import com.asayke.tinkoffservice.dto.StocksPricesDto;
import com.asayke.tinkoffservice.dto.TickersDto;
import com.asayke.tinkoffservice.model.Currency;
import com.asayke.tinkoffservice.model.Stock;
import com.asayke.tinkoffservice.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StockController {
    private final StockService stockService;

    @GetMapping("/stocks/{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return stockService.getStockByTicker(ticker);
    }

    @PostMapping("/stocks/getStocksByTickers")
    public StocksDto getStocksByTickers(@RequestBody TickersDto tickersDto) {
        return stockService.getStocksByTickers(tickersDto);
    }

    @PostMapping("/prices")
    public StocksPricesDto getPrices(@RequestBody FigiesDto figiesDto) {
        return stockService.getPricesStocksByFigies(figiesDto);
    }
}
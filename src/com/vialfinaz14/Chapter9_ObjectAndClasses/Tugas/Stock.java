package com.vialfinaz14.Chapter9_ObjectAndClasses.Tugas;

public class Stock {
    String symbol;
    String name;
    double previosClosingPrice;
    double currentPrice;
    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }
    double getChangePercent() {
        return ((currentPrice - previosClosingPrice) /
                previosClosingPrice) * 100;
    }
}

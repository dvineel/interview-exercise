package com.acme.mytrader.strategy;

import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceSource;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 *
 * Connects to a PriceSource instance
 * Monitors price movements on a specified single stock (e.g. "IBM")
 * Executes a single "buy" instruction for a specified number of lots (e.g. 100) as soon as the price of that stock is seen to be below a specified price (e.g. 55.0). Don’t worry what units that is in.
 *
 */
public class TradingStrategy {
}

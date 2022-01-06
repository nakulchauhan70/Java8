package com.demo.java.util.concurrent.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.function.DoubleBinaryOperator;

public class DoubleAccumulatorDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		DoubleBinaryOperator doubleBinaryOperator = (x, y) -> x + y;
		DoubleAccumulator doubleAccumulator = new DoubleAccumulator(doubleBinaryOperator, 5.0);
		
		DoubleAccumulatorService task1 = new DoubleAccumulatorService(doubleAccumulator, 10L);
		DoubleAccumulatorService task2 = new DoubleAccumulatorService(doubleAccumulator, 10L);
		
		List<Callable<Double>> tasks = new ArrayList<>();
		tasks.add(task1);
		tasks.add(task2);
		
		List<Future<Double>> invokeAll = Executors.newFixedThreadPool(2).invokeAll(tasks);
		
		for (Future<Double> future : invokeAll) {
			future.get();
		}
		
		double d = doubleAccumulator.get();
		System.out.println(d);
	}
}

class DoubleAccumulatorService implements Callable<Double> {

	private DoubleAccumulator doubleAccumulator;
	private long noOfTimes;

	public DoubleAccumulatorService(DoubleAccumulator doubleAccumulator, long noOfTimes) {
		super();
		this.doubleAccumulator = doubleAccumulator;
		this.noOfTimes = noOfTimes;
	}

	@Override
	public Double call() throws Exception {
		for (int i = 1; i <= noOfTimes; i++) {
			System.out.println(Thread.currentThread().getName());
			doubleAccumulator.accumulate(10.0);
		}

		double d = doubleAccumulator.get();
		return d;
	}

}

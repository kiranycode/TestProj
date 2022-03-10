package com.dailybyte.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClosestPairofPoints {

	public static void main(String[] args) {
		List<MyPoint> points = new ArrayList<>();
		points.add(new MyPoint(2, 3));
		points.add(new MyPoint(12, 30));
		points.add(new MyPoint(40, 50));
		points.add(new MyPoint(5, 1));
		points.add(new MyPoint(12, 10));
		points.add(new MyPoint(3, 4));

		divideAndConquar(points);
	}

	private static void divideAndConquar(List<MyPoint> points) {
		List<MyPoint> sortedList = new ArrayList<MyPoint>(points);
		Collections.sort(sortedList, (o1, o2) -> Integer.signum(o1.x - o2.x));
		BestPairPoint best = divideAndConquarAux(sortedList);
		 System.out.println(best.distance());
		

	}

	private static BestPairPoint divideAndConquarAux(List<MyPoint> points) {
		BestPairPoint best = null;
		if (points.size() < 2) {
			return null;
		}

		if (points.size() <= 3) {
			return bruteForce(points);
		}

		int mid = points.size() / 2;
		MyPoint midpoint = points.get(mid);
		BestPairPoint bl= divideAndConquarAux(points.subList(0, mid));
		BestPairPoint br = divideAndConquarAux(points.subList(mid, points.size()));
		best=bl;
		if(br.distance()<best.distance()){
			best = br;
		}
		
		List<MyPoint> strip = new ArrayList<MyPoint>(points);
		for(int i=0;i<points.size();i++){
			if(Math.abs(midpoint.x-points.get(i).x)< best.distance()){
				strip.add(points.get(i));
			}
		}
		return getBestInStrip(strip, best);		

	}

	private static BestPairPoint getBestInStrip(List<MyPoint> strip, BestPairPoint best) {
		List<MyPoint> sortedList = new ArrayList<MyPoint>(strip);
		Collections.sort(sortedList, (o1,o2)->Integer.signum(o1.y-o2.y));
		for(int i=0; i<sortedList.size()-1 && (Math.abs(sortedList.get(i).y - sortedList.get(i+1).y))<best.distance(); i++){
			best = new BestPairPoint(sortedList.get(i),sortedList.get(i+1));
		}
		return best;
	}

	private static BestPairPoint bruteForce(List<MyPoint> points) {
		BestPairPoint best;
		best = new BestPairPoint(points.get(0), points.get(1));
		for (int i = 2; i < points.size(); i++) {
			for (int j = i - 1; j >= 0; j--) {
				BestPairPoint otherPair = new BestPairPoint(points.get(i), points.get(j));
				best = otherPair.distance() < best.distance() ? otherPair : best;
			}
		}
		System.out.println(best.distance());
		return best;
	}

}

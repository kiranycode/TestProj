package com.dailybyte.questions;

public class BestPairPoint {
	
	public MyPoint p;
	public MyPoint q;
	
	
	public BestPairPoint(MyPoint p, MyPoint q) {
		this.p = p;
		this.q = q;
	}


	public double distance(){
		return  Math.sqrt(Math.abs(p.x-q.x) + Math.abs(p.y-q.y));
	}

}

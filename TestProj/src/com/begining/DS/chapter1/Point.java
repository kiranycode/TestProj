package com.begining.DS.chapter1;

public class Point {
	public int x;
	public int y;
	String name; 
	public Point(int x, int y,String name) {
		this.x=x;
		this.y=y;
		this.name= name;
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;		
	}
	
	public double getDistance(Point other){
		return Math.sqrt(Math.pow(this.x-other.x, 2) +Math.pow(this.y-other.y, 2));	
	}
	

}

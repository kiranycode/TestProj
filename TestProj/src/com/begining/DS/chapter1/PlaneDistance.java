package com.begining.DS.chapter1;

import java.util.ArrayList;
import java.util.List;

public class PlaneDistance {

	public static void main(String[] args) {
	//	List<Point> allPlanes = new ArrayList<>();
		//allPlanes.add(new Point(5, 5));
		//allPlanes.add(new Point(15, 66));
		//allPlanes.add(new Point(105, 42));
		//allPlanes.add(new Point(7, 6));
		//AlertClosetPlanes(allPlanes, 3);
	}

	private static void AlertClosetPlanes(List<Point> allPlanes, double minDistance) {
		double d = Double.MAX_VALUE;
		for(int i=0; i<allPlanes.size(); i++){
			for(int j=i+1; j<allPlanes.size();j++){
				Point p1=allPlanes.get(i);
				Point p2=allPlanes.get(j);			
				if(p1!=p2){
					d= p1.getDistance(p2);
					
					if(d<minDistance){
						System.out.println(p1.x+"  "+p1.y+"       Distance :" +d+"    p2 "+p2.x+"  "+p2.y);
					}
					
				}
			}

		}

	}

}

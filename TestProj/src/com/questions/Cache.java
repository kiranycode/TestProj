package com.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cache {

	public static void main(String[] args) {
		//String edges[] ={"8 1","5 8","7 3","8 6"};		
		//int n=8;
		
		List<String> edges =new ArrayList<>();	
		edges.add("8 1");
		edges.add("5 8");
		edges.add("7 3");
		edges.add("8 6");
				
		int n=8;
		
		System.out.println(getNodes(n, edges));
		
		edges =new ArrayList<>();
		edges.add("1 2");
		edges.add("1 4");
				
		 n=4;
		 System.out.println(getNodes(n, edges));
		 
		
	}

	private static int getNodes(int n, List<String> edges) {
		Set<Integer> numberSet = new HashSet<>();
		
		 int[][] arr = new int[edges.size()][2];
		for(int i=0; i<edges.size(); i++){
			String s= edges.get(i);			
			String [] nodeNumbers = s.split(" ");
			
			
			int x = Integer.parseInt(nodeNumbers[0]);
			int y= Integer.parseInt(nodeNumbers[1]);
			
			if(x>=1 && x<=n){
				numberSet.add(x);
				arr[i][0]=x;
			}
			if(y>=1 && y<=n){
				numberSet.add(y);
				arr[i][1]=y;
			}
			
		}
		
		return set(n, arr);
	}
	
	
	public static int set(int n, int[][] arr) {
        if (n < 2) {
            return n;
        }
        List<HashSet<Integer>> list = (new ArrayList<>());

        for (int i = 0; i < n; i++) {
            HashSet<Integer> intHash = new HashSet<>();
            intHash.add(i);
            list.add(intHash);
        }

        for (int[] edge : arr) {
            HashSet<Integer> value = null;
            for (int i = 0; i < list.size(); i++) {
                HashSet<Integer> item = list.get(i);
                if (item.contains(edge[0])) {
                    if (value == null) {
                        value = item;
                    } else {
                        value.addAll(item);
                        list.remove(item);
                    }
                }
                if (item.contains(edge[1])) {
                    if (value == null) {
                        value = item;
                    } else {
                        value.addAll(item);
                        list.remove(item);
                    }
                }
            }
        }
        int result = 0;
        for (HashSet<Integer> item : list) {
            result = (int) (result + Math.ceil(Math.sqrt(item.size())));
        }
        return result;
    }
	
	
	private static int test(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return -1;
        }
        for (int i = 0; i < str1.length(); i++) {
            boolean found = true;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt((i + j) % str1.length()) != str2.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

}

package com.dailybyte.questions;

public class VacuumCleanerRoute {

	public static void main(String[] args) {
		VacuumCleanerRoute vacuumCleanerRoute =  new VacuumCleanerRoute();
	//	System.out.println("LR, return "+vacuumCleanerRoute.isVCBack("LR"));
	//	System.out.println("LR, return "+vacuumCleanerRoute.isVCBack("URURD"));
	//	System.out.println("LR, return "+vacuumCleanerRoute.isVCBack("RUULLDRD"));
		
		
		String s[ ] ="bbbb".split("b");
		System.out.println(s.length);

	}
	
	public boolean isVCBack1(String route){				
		char [] c = route.toCharArray();		
		int leftRightCnt=0;
		int upDownCnt=0;
		
		for(int i=0; i<c.length;i++){
			if(c[i]=='R'){
				leftRightCnt++;
			}else if(c[i]=='L'){
				leftRightCnt--;
			}else if(c[i]=='U'){
				upDownCnt++;
			}else if(c[i]=='D'){
				upDownCnt--;
			}
		}
		if(leftRightCnt==0 && upDownCnt==0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isVCBack(String route){				
		char [] c = route.toCharArray();
		int leftRightCnt=0;
		int upDownCnt=0;
		
		for(int i=0; i<c.length;i++){			
			
			switch(c[i]){
			
			case 'R':{
				leftRightCnt++;
				break;
			}
			case 'L':
				leftRightCnt--;
				break;	
			
			case 'U':
				upDownCnt++;
				break;	
			case 'D':
				upDownCnt--;
				break;	
			}
							
		}
		if(leftRightCnt==0 && upDownCnt==0){
			return true;
		}else{
			return false;
		}
	}
	

}

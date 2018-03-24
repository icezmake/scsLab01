package labo;


public class Triangle {
	
	public static void main(String[] args){
		Triangle t = new Triangle();
		if(t.can(1, 1, 1)==2){
			System.out.println("yes");
		}
		
		if(t.can(1, 1, 1)==1){
			System.out.println("yes");
		}
	}
	
	
	public int can(int a,int b,int c){
		if(a+b<=c || a+c<=b || b+c<=a ){
			//if it's not a triangle
			return 1;
		}
		
		if(a==b && b==c){
			//it's a equilateral
			return 2;
		}
		
		if(a==b || a==c || b==c){
			//a isosceles
			return 3;
		}
		//scalene
		return 4;
	}
	
	//Test weather it's a equilateral
	public boolean eq(int a,int b,int c){
		if(a+b<=c || a+c<=b || b+c<=a ){
			return false;
		}
		
		if(a==b && b==c){
			return true;
		}
		return false;
	}
	
	//Test weather it's a isosceles
	public boolean iso(int a,int b,int c){
		if(a+b<=c || a+c<=b || b+c<=a ){
			return false;
		}
		
		if(a==b || b==c || a==c){
			return true;
		}
		return false;
	}
	
	//Test weather it's a scalene
	public boolean scale(int a,int b,int c){
		if(a+b<=c || a+c<=b || b+c<=a ){
			return false;
		}
		
		if(a==b || b==c || a==c){
			return false;
		}
		return true;
	}
}

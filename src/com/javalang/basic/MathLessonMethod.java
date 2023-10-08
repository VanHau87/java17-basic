package com.javalang.basic;

public class MathLessonMethod {
	static int standard = 6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rand = demoRandom();
		System.out.println(rand);
		//round down
		System.out.println(Math.floor(rand));
		//round up
		System.out.println(Math.ceil(rand));
		//round up (rand >= 0.5) round down (rand < 0.5) 
		System.out.println(Math.round(rand));
		
		System.out.println("###########");
		/*find max min */
		System.out.println(Math.max(standard, rand));
		System.out.println(Math.min(standard, rand));
		
		System.out.println("############");
		/* calculate x power y */
		System.out.print("power ");
		System.out.println(Math.pow(10, 2));
		/* sqrt = square root */
		System.out.println(Math.sqrt(9));
		System.out.println(Math.log10(8));
		
	}
	private static double demoRandom() {
		double random = (Math.random() * 10) + 1;
		/* random returns 1 double number [0.0 - 1) */
		return random;
	}

}

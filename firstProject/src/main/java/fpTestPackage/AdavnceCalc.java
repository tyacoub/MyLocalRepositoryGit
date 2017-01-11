package fpTestPackage;

public class AdavnceCalc {

	private String infoMsg;

	public String getInfoMsg() {
		return infoMsg;
	}

	/**
	 * 
	 * @param num input
	 * @return num(num-1)(num-2)..*2*1
	 */
	public int getFactory(final int num){
		
		int res = 1;
		
		for(int count = num; count > 1; count--){
			res *= count;
		}
		
		return res;
	}
	/**
	 * 
	 * @param a first number
	 * @param b second number
	 * @return Greatest Common Divisor of (a, b)
	 */
	public int getGCD(int a, int b){
		if(a == b)
			return a;
		if(a > b)
			return getGCD(a-b,b);
		else
			return getGCD(a,b-a);
	}
	

	/**
	 * 
	 * @param a	first number
	 * @param b second number
	 * @return Least Common Multiple of (a, b)
	 */
	public int getLCM(int a, int b){
		return a*b/getGCD(a,b);
	}
	
	private double getDelta(double a, double b, double c){
		return b*b-4*a*c;
	}
	/**
	 * resolves the equation aX2 +bX +c = 0
	 * @param a
	 * @param b
	 * @param c
	 * @return array, when delta >= 0, null otherwise with infoMsg 
	 */
	public double[] getQuadEquRoots(double a, double b, double c){
		
		double[] res = null;
		double delta = getDelta(a, b, c);
		if(delta == 0){
			res = new double[1];
			res[0] = -b/2*a;
		}else if(delta > 0){
			res = new double[2];
			res[0] = (-b+Math.sqrt(delta))/2*a;
			res[1] = (-b-Math.sqrt(delta))/2*a;
		}else{
			infoMsg = "can't be resolved";
		}
		
		
		return res;
		
		
	}
	
	/**
	 *
	 * @param a	first number
	 * @param b second number
	 * @return the bigger of (a, b)
	 */
	public int getBigger(int a, int b){
		if(a <= b)
			return b;
		return a;

	}
	
	public int getSmaller(int a, int b){
		if(a <= b)
			return a;
		return b;

	}
	
	public double getTriangleArea(int a, int b, int c){
		
		
		if(a <= 0 || b <= 0 || c <= 0){
			infoMsg = "invalid triangle's lengths";
			return 0;
		}
		
		final float halfSum = (a+b+c)/2;
		return Math.sqrt(halfSum*(halfSum - a)*(halfSum - b)*(halfSum - c));
		
	}
}
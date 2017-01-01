package fpTestPackage;

public class AdavnceCalc {

	private String infoMsg;

	public String getInfoMsg() {
		return infoMsg;
	}

	public int getFactory(final int num){
		
		int res = 1;
		
		for(int count = num; count > 1; count--){
			res *= count;
		}
		
		return res;
	}
	
	public int getGCD(int a, int b){
		if(a == b)
			return a;
		if(a > b)
			return getGCD(a-b,b);
		else
			return getGCD(a,b-a);
	}
	
	private double getDelta(double a, double b, double c){
		return b*b-4*a*c;
	}
	
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
}

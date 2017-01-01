package fpTestPackage;

public class AdavnceCalc {

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
	
	public int getLCM(int a, int b){
		return a*b/getGCD(a,b);
	}
}

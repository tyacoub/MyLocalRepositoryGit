package fpTestPackage;

public class AdavnceCalc {

	public int getFactory(final int num){
		
		int res = 1;
		
		for(int count = num; count > 1; count--){
			res *= count;
		}
		
		return res;
	}
}

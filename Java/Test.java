import java.util.ArrayList;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test.getNumberOfPrimes(100));
	}
	static int getNumberOfPrimes(int N) {
	    ArrayList<Integer> a=new ArrayList<Integer>();
	    if (N==2)
	    	return 1;
	    if (N==3)
	    	return 2;
	    if (N<2)
	    	return -1;
	    		
	    a.add(2);
	    a.add(3);
	    
	    int i,t,f;
	    for(t=5;t<=N;t=t+2){
	    	f=0;
		    for(i=0;a.get(i)*a.get(i)<=t;i++){
		    	if(t%a.get(i)==0){
		    		f=1;
		    		break;
		    	}
		    }
		    if(f!=1)
		    	a.add(t);
	    }
	    return a.size();
	}


}

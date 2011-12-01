import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.lang.*;

public class Yahoo {

	/**
	 * @param args
	 */
	
	static ArrayList<String> a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=new ArrayList<String>();
		subset("cattt");
		for(String s:a){
			System.out.println(s);
		}
		
		//System.out.println("c".substring(0, 0)+"ddd");
		//System.out.println("c".substring(0)+"dwdd");
		
	}
	
	static void subset(String input){
		
		HashMap<String,String> dict=new HashMap<String,String>();
		
		for(int i=0;i<input.length();i++){
			String key=""+input.charAt(i);
			if (!dict.containsKey(key)){
		        dict.put(key, "");
		      }
		}
		
		
		Iterator it = dict.keySet().iterator();
	    String in = "";
	    while(it.hasNext()){
	      in=in+it.next().toString();
	   
	    }
        a.add("");
        //System.out.println(in);
	    subset0(in);
	}
	
	static void subset0(String s){
		
		
		if(s.length()==1){
			a.add(s);
		}
		else{
			String s1=s.substring(1);
			//System.out.println(s1+"--");
			subset0(s1);
			String s0=s.charAt(0)+"";
			int size=a.size();
			//System.out.println(size+"--");
			for(int i=0;i<size;i++){
				String temp=a.get(i);
				if(temp.equals(""))
					a.add(s0);
				else{
					for(int k=0;k<temp.length();k++){
						//System.out.println(a.get(i)+"{"+a.get(i).substring(0,k)+"}"+a.get(i).substring(k));
						a.add(temp.substring(0,k)+s0+temp.substring(k));
					}				
					a.add(temp+s0);
				}
			}
		}
		
	}


}

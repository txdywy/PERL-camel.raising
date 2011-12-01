import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;


public class Solution {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String str;
	    try{
	    	str = in.readLine();
	    	Solution s=new Solution(str);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public Solution(String input){
		Hashtable<String,String> a=new Hashtable<String,String>();
		a.put("AAA", "K");
		a.put("AAC", "N");
		a.put("AAG", "K");
		a.put("AAT", "N");
		a.put("ACA", "T");
		a.put("ACC", "T");
		a.put("ACG", "T");
		a.put("ACT", "T");
		a.put("AGA", "R");
		a.put("AGC", "S");
		a.put("AGG", "R");
		a.put("AGT", "S");
		a.put("ATA", "I");
		a.put("ATC", "I");
		a.put("ATG", "M");
		a.put("ATT", "I");
		
		a.put("CAA", "Q");
		a.put("CAC", "H");
		a.put("CAG", "Q");
		a.put("CAT", "H");
		a.put("CCA", "P");
		a.put("CCC", "P");
		a.put("CCG", "P");
		a.put("CCT", "P");
		a.put("CGA", "R");
		a.put("CGC", "R");
		a.put("CGG", "R");
		a.put("CGT", "R");
		a.put("CTA", "L");
		a.put("CTC", "L");
		a.put("CTG", "L");
		a.put("CTT", "L");
		
		a.put("GAA", "E");
		a.put("GAC", "D");
		a.put("GAG", "E");
		a.put("GAT", "D");
		a.put("GCA", "A");
		a.put("GCC", "A");
		a.put("GCG", "A");
		a.put("GCT", "A");
		a.put("GGA", "G");
		a.put("GGC", "G");
		a.put("GGG", "G");
		a.put("GGT", "G");
		a.put("GTA", "V");
		a.put("GTC", "V");
		a.put("GTG", "V");
		a.put("GTT", "V");
		
		a.put("TAA", "X");
		a.put("TAC", "Y");
		a.put("TAG", "X");
		a.put("TAT", "Y");
		a.put("TCA", "S");
		a.put("TCC", "S");
		a.put("TCG", "S");
		a.put("TCT", "S");
		a.put("TGA", "X");
		a.put("TGC", "C");
		a.put("TGG", "W");
		a.put("TGT", "C");
		a.put("TTA", "L");
		a.put("TTC", "F");
		a.put("TTG", "L");
		a.put("TTT", "F");
		
		
		
		
		int start=0;
		int i=0;
		while(i<input.length()-2){
			if(start==0){
				if(input.charAt(i)=='A' && input.charAt(i+1)=='T' && input.charAt(i+2)=='G'){
					start=1;
					System.out.print(a.get("ATG"));
					i=i+3;
				}
				else
					i++;
			}
			else{
				String temp=""+input.charAt(i)+input.charAt(i+1)+input.charAt(i+2);
				if(temp.equals("TAA")||temp.equals("TAG")||temp.equals("TGA")){
					start=0;
					//System.out.println(a.get(temp));
					System.out.println();
				}
				else{	
					System.out.print(a.get(temp));
				}
				i=i+3;
			}
				
		}
		
		
	}

}

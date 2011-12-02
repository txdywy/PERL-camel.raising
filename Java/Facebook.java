import java.lang.annotation.Documented;

public class Facebook {

	/**
	 * @param args
	 */
	@Documented
	@interface ClassPreamble {
		   String author();
		   String date();
		   int currentRevision() default 1;
		   String lastModified() default "N/A";
		   String lastModifiedBy() default "N/A";
		   String[] reviewers();  // Note use of array
	}
	
	@ClassPreamble (
			   author = "John Doe",
			   date = "3/17/2002",
			   currentRevision = 6,
			   lastModified = "4/12/2004",
			   lastModifiedBy = "Jane Doe",
			   reviewers = {"Alice", "Bob", "Cindy"} // Note array notation
	)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
			printLine(i);
	}
	static void printLine(int n){
		String last="";
		String current="1";
		for(int i=2;i<=n;i++){
			int lastIndex=0;
			last=current;
			current="";
			String tempLast=""; 
			int count=0;
			
			while(lastIndex<last.length()){
				
				if(count==0){
					tempLast=""+last.charAt(lastIndex);//System.out.println(count+".."+tempLast);
					count++;
				}
				else{	//System.out.println(tempLast+","+last.charAt(lastIndex));
					String temp=""+last.charAt(lastIndex);
					if(tempLast.equals(temp))
						count++;
					else{
						//System.out.println(count+".."+tempLast);
						current+=count+tempLast;
						tempLast=""+temp;
						count=1;
					}
				}
				lastIndex++;
			}
			current+=count+tempLast;
			
		}
		System.out.println("Line "+n+": "+current);
	}

}

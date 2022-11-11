package Demo;

public class Arraymarks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[]= {84,95,100,48,99,75};
		
		int rank[]= {1,2,3,4,5,6};
		
		int length_of_array= mark.length;
		
		int tmp; 
		
		
		for(int i=0;i<length_of_array-1;i++)
			
		{
				if(mark[i]>mark[i+1]) 
					
				{
					
					tmp=mark[i];
					mark[i]=mark[i+1];
					mark[i+1]=tmp;
				}
		}
		System.out.println("Marks - Rank");
		for(int i=length_of_array-1,k=0;i>=0;i--)
			
		{
			System.out.println(mark[i]+"   -   "+rank[k]);
			
			k++;
			
		}
	}

	
}

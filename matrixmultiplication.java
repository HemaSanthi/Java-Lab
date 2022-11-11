package Demo;

public class matrixmultiplication{
	public static void main(String args[]){  
		//creating two matrices    
		int a[][]={{1,13,15},{22,27,29},{33,37,30}};    
		int b[][]={{1,11,16},{27,24,20},{34,36,39}};    
		    
		int c[][]=new int[3][3]; 
		    
		    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}  
		System.out.print(c[i][j]+" ");  
		} 
		System.out.println();    
		}    
		}

}

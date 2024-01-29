package com.blueyonder.questions;

import java.util.Scanner;

public class Table {
	
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the rows and columns");
	   int m,n;
	   m=sc.nextInt();
	   n=sc.nextInt();
	   int[][] ar=new int[m][n];
	   System.out.println("enter the elements of the matrix");
	   for(int i=0;i<m;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   int x=sc.nextInt();
			   ar[i][j]=x;
		   }
	   }
	   int ansr=-1,ansc=-1;
	   int maxi=-10^9;
	   for(int i=0;i<m;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   int ans=0;
			  
			  for(int q=-1;q<=1;q++)
			  {
				  for(int w=-1;w<=1;w++)
				  {
					int nr=i+q;
					int nc=j+w;
					if(nr>=0 && nr<m && nc>=0 && nc<n)
					{
						ans=ans+ar[nr][nc];
					}
				  }
			  }
			  
			  if(maxi<ans)
			  {
				  maxi=ans;
				  ansr=i;
				  ansc=j;
			  }
		   }
	   }
	   System.out.println(ansr);
	   System.out.println(ansc);
	   System.out.println(maxi);
	   
	   
	   		
	   
   }

}

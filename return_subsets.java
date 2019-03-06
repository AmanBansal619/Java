public class return_subsets 
{
	public static int[][] subsets(int input[]) 
    {
		if(input.length==0) 
		{
			int[][]arr =new int[1][0];
			return arr;
		}	
      return subsets(input,0);
	}
    public static int[][] subsets(int input[],int start)
    {
      if(start==input.length)
      {
    	  int ans[][]=new int[1][0];
			return ans;
      }
      int smallans[][]=subsets(input,start+1);
      int ans[][]=new int[2*smallans.length][];
      int k=0;
      for(int i=0;i<smallans.length;i++)
      {
    	  ans[i]=new int[smallans[i].length];
    	  for(int j=0;j<ans[i].length;j++)
    	  {
    		  ans[i][j]=smallans[i][j];
    	  }
    	  k++;
      }
      for(int i=0;i<smallans.length;i++)
      {
    	  int l=1;
    	  ans[k]=new int[smallans[i].length+1];
    	  ans[k][0]=input[start];
    	  for(int j=0;j<ans[i].length;j++)
    	  {
    		 ans[k][l]=smallans[i][j]; 
    		 l++;
    	  }
    	  k++;
      }
      return ans;
    }
    public static void main(String args[])
    {
    	int a[]= {15,20,12};
    	int b[][]=subsets(a);
    	for(int i=0;i<b.length;i++)
    	{
    		for(int j=0;j<b[i].length;j++)
    		{
    			System.out.print(b[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    

}

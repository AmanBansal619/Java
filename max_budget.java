public class max_budget
{
	public static int maximumProfit(int budget[]) 
    {
		return profit(budget,0,1,1);
	}
	public static int calculate(int budget[],int start,int start2,int count)
	{
		if(start2>budget.length-1)
		{
			return count;
		}
		if(budget[start]<=budget[start2])
		{
			count++;
		}
		return calculate(budget,start,start2+1,count);
	}
	public static int profit(int budget[],int start,int price1,int maxprice)
	{
		price1=1;
		if(start>budget.length-1)
		{
			return maxprice;
		}
		int count1=calculate(budget,start,0,0);
		price1=count1*budget[start];
		if(price1>maxprice)
		{
			maxprice=price1;
		}
		return profit(budget,start+1,price1,maxprice);
	}
	public static void main(String args[])
	{
		int budget[]= {30,20,53,14,15,18};
		System.out.println(maximumProfit(budget));
	}
}

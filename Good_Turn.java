class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int dice = x + y;
    		if(dice <= 6)
    		{ System.out.println("NO");}
    		else{ System.out.println("YES");}
		}
		
	}
}


/*
Good Turn
Chef and Chefina are playing with dice. In one turn, both of them roll their dice at once.

They consider a turn to be good if the sum of the numbers on their dice is greater than 6 Given that in a particular turn Chef and Chefina got 
X and Y on their respective dice, find whether the turn was good
Sample 1:
Input

4
1 4
3 4
4 2
2 6
Output

NO
YES
NO
YES*/

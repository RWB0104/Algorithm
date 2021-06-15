package beakjoon.all.a1014;

import java.io.*;
import java.util.Arrays;

public class Main
{
	static int[][] room;
	
	static boolean[][] canSit;
	
	static int N, M;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(reader.readLine());
		
		while (T-- > 0)
		{
			String[] temp = reader.readLine().split(" ");
			
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			room = new int[N][M];
			
			canSit = new boolean[N][M];
			
			for (int n = 0; n < N; n++)
			{
				Arrays.fill(room[n], 0);
				
				temp = reader.readLine().split("");
				
				for (int m = 0; m < temp.length; m++)
				{
					canSit[n][m] = temp[m].equals(".");
				}
			}
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}
}
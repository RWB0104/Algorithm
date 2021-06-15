package beakjoon.all.a1014;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 백준 전체 1014 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/06/13/A1014/">1014 풀이</a>
 * @since 2021.06.13 Sun 04:34:19
 */
public class Main
{
	private static int[][] room;
	
	// 교실 가로 길이
	private static int N;
	
	// 교실 세로 길이
	private static int M;
	
	private static boolean[][] canSit;
	private static int broken;
	
	private static int[] nodes;
	
	/**
	 * 메인 함수
	 *
	 * @param args: [String[]] 매개변수
	 *
	 * @throws IOException 데이터 입출력 예외
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] scope = { { -1, 1 }, { -1, 0 }, { -1, -1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };
		
		// 케이스 수
		int T = Integer.parseInt(reader.readLine());
		
		while (T-- > 0)
		{
			String[] temp = reader.readLine().split(" ");
			
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			room = new int[N][M];
			
			canSit = new boolean[N][M];
			
			broken = 0;
			
			nodes = new int[N * M];
			
			int numbering = 1;
			
			for (int n = 0; n < N; n++)
			{
				Arrays.fill(room[n], 0);
				
				temp = reader.readLine().split("");
				
				for (int m = 0; m < M; m++)
				{
					room[n][m] = numbering++;
					
					// 자리가 온전할 경우
					if (temp[m].equals("."))
					{
						canSit[n][m] = true;
					}
					
					// 자리가 파손된 경우
					else
					{
						canSit[n][m] = false;
						
						broken++;
					}
				}
			}
			
			for (int n = 0; n < N; n++)
			{
				for (int m = 0; m < M; m += 2)
				{
					// 자리가 온전할 경우
					if (canSit[n][m])
					{
						int num = 0;
						
						for (int i = 0; i < 6; i++)
						{
							int nx = m + scope[i][0];
							int ny = n + scope[i][1];
							
							// x, y의 위치가 교실을 벗어나지 않으며, 자리가 파손된 경우
							if (nx >= 0 && ny >= 0 && nx < M && ny < N && canSit[ny][nx])
							{
								num += 1 << room[ny][nx];
							}
						}
						
						int point = room[n][m] - 1;
						
						nodes[point] = num;
					}
				}
			}
			
			System.out.println("-");
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}
	
	private static int match()
	{
		int size = 0;
		
		int[] visit = new int[N * M + 1];
		
		int[] leftMatch = new int[N * M + 1];
		int[] rightMatch = new int[N * M + 1];
		
		Arrays.fill(leftMatch, -1);
		Arrays.fill(rightMatch, -1);
		
		for (int i = 0; i < room.length; i++)
		{
		
		}
	}
}
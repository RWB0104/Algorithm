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
	// 교실 세로 길이 (y)
	private static int N;
	
	// 교실 가로 길이 (x)
	private static int M;
	
	// 자리 번호
	private static int[][] room;
	
	// 컨닝 가능한 자리
	private static int[] nodes;
	
	private static int visitCount = 1;
	
	private static int[] visit;
	private static int[] matched;
	
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
		
		// 현재 자리에서 컨닝이 가능한 자리의 위치 상대좌표
		int[][] scopes = { { -1, 1 }, { -1, 0 }, { -1, -1 }, { 1, 1 }, { 1, 0 }, { 1, -1 } };
		
		// 케이스 수
		int C = Integer.parseInt(reader.readLine());
		
		while (C-- > 0)
		{
			String[] temp = reader.readLine().split(" ");
			
			N = Integer.parseInt(temp[0]);
			M = Integer.parseInt(temp[1]);
			
			// 자리의 파손 여부
			boolean[][] canSit = new boolean[N][M];
			
			// 자리의 번호
			int numbering = 1;
			
			// 파손된 자리의 총 갯수
			int broken = 0;
			
			room = new int[N][M];
			nodes = new int[N * M];
			
			for (int n = 0; n < N; n++)
			{
				temp = reader.readLine().split("");
				
				for (int m = 0; m < M; m++)
				{
					// 자리 번호 기록
					room[n][m] = numbering++;
					
					if (temp[m].equals("."))
					{
						// 파손 여부 기록
						canSit[n][m] = true;
					}
					
					else
					{
						canSit[n][m] = false;
						
						broken++;
					}
				}
			}
			
			for (int n = 0; n < N; n++)
			{
				// 홀수 열만 대상으로 동작함
				for (int m = 0; m < M; m += 2)
				{
					if (canSit[n][m])
					{
						int connected = 0;
						
						for (int[] scope : scopes)
						{
							int no = n + scope[1];
							int mo = m + scope[0];
							
							if (no > -1 && mo > -1 && no < N && mo < M && canSit[no][mo])
							{
								// 컨닝이 가능한 자리의 번호를 비트마스킹하여 더함
								connected += (1 << room[no][mo]);
							}
						}
						
						int position = room[n][m];
						
						// 현재 자리에서 컨닝이 가능한 모든 자리의 번호를 비트마스킹으로 기록
						nodes[position] = connected;
					}
				}
			}
			
			int result = bipartite();
			
			writer.write(Integer.toString(N * M - broken - result));
			writer.newLine();
			writer.flush();
		}
		
		writer.close();
		reader.close();
	}
	
	private static int bipartite()
	{
		int size = 0;
		
		visit = new int[N * M];
		matched = new int[N * M];
		
		Arrays.fill(matched, -1);
		
		for (int n = 0; n < N; n++)
		{
			for (int m = 0; m < M; m += 2)
			{
				visitCount++;
				
				size += dfs(room[n][m]);
			}
		}
		
		return size;
	}
	
	private static int dfs(int num)
	{
		if (visit[num] != visitCount)
		{
			visit[num] = visitCount;
			
			for (int i = 0; i < N * M; i++)
			{
				if ((nodes[num] & (1 << i)) > 0)
				{
					if (matched[i] == -1 || dfs(matched[i]) == 1)
					{
						matched[i] = num;
						
						return 1;
					}
				}
			}
		}
		
		return 0;
	}
}
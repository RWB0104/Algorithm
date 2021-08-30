package beakjoon.all.a1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 전체 1012 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/06/13/a1012">1012 풀이</a>
 * @since 2021.06.13 Sun 01:30:12
 */
public class Main
{
	// 배추밭의 가로 길이(x)
	private static int M;
	
	// 배추밭의 세로 길이(y)
	private static int N;
	
	// 배추밭
	private static int[][] area;
	
	// 구역 방문 여부
	private static boolean[][] isVisit;
	
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
		
		// 케이스 수
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++)
		{
			String[] temp = reader.readLine().split(" ");
			
			M = Integer.parseInt(temp[0]);
			
			N = Integer.parseInt(temp[1]);
			
			// 배추 갯수
			int K = Integer.parseInt(temp[2]);
			
			area = new int[M][N];
			
			isVisit = new boolean[M][N];
			
			// 필요한 배추흰지렁이 수
			int bugs = 0;
			
			for (int j = 0; j < K; j++)
			{
				temp = reader.readLine().split(" ");
				
				int x = Integer.parseInt(temp[0]);
				int y = Integer.parseInt(temp[1]);
				
				area[x][y] = 1;
			}
			
			for (int y = 0; y < N; y++)
			{
				for (int x = 0; x < M; x++)
				{
					// 방문하지 않은 구역에 배추가 있을 경우
					if (area[x][y] == 1 && !isVisit[x][y])
					{
						bugs++;
						
						dfs(x, y);
					}
				}
			}
			
			System.out.println(bugs);
		}
		
		reader.close();
	}
	
	/**
	 * 깊이 우선 탐색 알고리즘
	 *
	 * @param x: [int] x좌표
	 * @param y: [int] y좌표
	 */
	private static void dfs(int x, int y)
	{
		// x의 상하좌우 이동
		int[] dx = { 0, 0, -1, 1 };
		
		// y의 상하좌우 이동
		int[] dy = { -1, 1, 0, 0 };
		
		isVisit[x][y] = true;
		
		for (int i = 0; i < 4; i++)
		{
			int xn = x + dx[i];
			int yn = y + dy[i];
			
			// x, y좌표가 구역 내부에 있으며, 방문하지 않은 구역에 배추가 있을 경우
			if ((xn > -1 && xn < M) && (yn > -1 && yn < N) && area[xn][yn] == 1 && !isVisit[xn][yn])
			{
				dfs(xn, yn);
			}
		}
	}
}
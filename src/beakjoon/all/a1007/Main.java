package beakjoon.all.a1007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 전체 1007 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/06/02/A1006/">1007 풀이</a>
 * @since 2021.06.06 Sun 22:44:45
 */
public class Main
{
	private static int[][] P;
	private static int[][] V;
	
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
		
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++)
		{
			int N = Integer.parseInt(reader.readLine());
			
			P = new int[N][2];
			
			for (int j = 0; j < N; j++)
			{
				String[] temp = reader.readLine().split(" ");
				
				P[j][0] = Integer.parseInt(temp[0]);
				P[j][1] = Integer.parseInt(temp[1]);
			}
		}
		
		reader.close();
	}
	
	private static void solve()
	{
	
	}
}
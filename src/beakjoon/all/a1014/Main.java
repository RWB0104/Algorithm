package beakjoon.all.a1014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 전체 1014 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/06/13/A1014/">1014 풀이</a>
 * @since 2021.06.13 Sun 16:34:19
 */
public class Main
{
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
			
			// 교실 세로 길이
			int N = Integer.parseInt(temp[0]);
			
			// 교실 가로 길이
			int M = Integer.parseInt(temp[1]);
			
			int[][] seat = new int[N][M];
			
			for (int j = 0; j < N; j++)
			{
				temp = reader.readLine().split("");
				
				for (int k = 0; k < temp.length; k++)
				{
					seat[j][k] = temp[k].equals(".") ? 1 : 0;
				}
			}
			
			for (int j = 0; j < N; j++)
			{
				for (int k = 0; k < temp.length; k++)
				{
					System.out.print(seat[j][k]);
				}
				
				System.out.println();
			}
		}
		
		reader.close();
	}
}
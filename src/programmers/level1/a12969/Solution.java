package programmers.level1.a12969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 직사각형 별찍기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 22:27:04
 */
class Solution
{
	/**
	 * 메인 메서드
	 *
	 * @param args: [String[]] 파라미터
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] inputs = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		for (int i = 0; i < inputs[1]; i++)
		{
			System.out.println("*".repeat(inputs[0]));
		}
		
		reader.close();
	}
}
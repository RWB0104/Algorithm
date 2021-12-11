package programmers.level1.a42748;

import java.util.Arrays;

/**
 * K번째수 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 21:28:35
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param array: [int[]] 배열
	 * @param commands: [int[][]] 인덱스 배열
	 *
	 * @return [int[]] k번째의 수
	 */
	public int[] solution(int[] array, int[][] commands)
	{
		int[] answer = new int[commands.length];
		
		for (int n = 0; n < answer.length; n++)
		{
			int i = commands[n][0];
			int j = commands[n][1];
			int k = commands[n][2];
			
			int length = j - i + 1;
			
			int[] temp = new int[length];
			
			System.arraycopy(array, i - 1, temp, 0, length);
			
			Arrays.sort(temp);
			
			answer[n] = temp[--k];
		}
		
		return answer;
	}
}
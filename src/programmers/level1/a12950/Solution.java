package programmers.level1.a12950;

/**
 * 행렬의 덧셈 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 22:12:23
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param arr1: [int[][]] 행렬 1
	 * @param arr2: [int[][]] 행렬 2
	 *
	 * @return [int[][]] 해답
	 */
	public int[][] solution(int[][] arr1, int[][] arr2)
	{
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr1[i].length; j++)
			{
				answer[i][j] += arr1[i][j] + arr2[i][j];
			}
		}
		
		return answer;
	}
}
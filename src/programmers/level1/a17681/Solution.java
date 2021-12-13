package programmers.level1.a17681;

/**
 * 비밀지도 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 16:54:09
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [int] 지도 길이
	 * @param arr1: [int[]] 지도 1
	 * @param arr2: [int[]] 지도 2
	 *
	 * @return [String[]] 해답
	 */
	public String[] solution(int n, int[] arr1, int[] arr2)
	{
		String[] map = new String[n];
		
		for (int i = 0; i < n; i++)
		{
			int[] map1 = dec2bin(n, arr1[i]);
			int[] map2 = dec2bin(n, arr2[i]);
			
			StringBuilder builder = new StringBuilder();
			
			for (int j = 0; j < n; j++)
			{
				// 하나라도 벽이 있을 경우 그 공간은 벽(#)
				builder.append((map1[j] | map2[j]) == 1 ? "#" : " ");
			}
			
			map[i] = builder.toString();
		}
		
		return map;
	}
	
	/**
	 * 10진수 -> 2진수 배열 반환 메서드
	 *
	 * @param n: [int] 크기
	 * @param num: [int] 10진수
	 *
	 * @return [int[]] 2진수 배열
	 */
	private int[] dec2bin(int n, int num)
	{
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			arr[n - i - 1] = num % 2;
			
			num /= 2;
		}
		
		return arr;
	}
}
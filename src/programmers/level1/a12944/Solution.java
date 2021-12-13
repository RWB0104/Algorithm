package programmers.level1.a12944;

import java.util.Arrays;

/**
 * 평균 구하기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 21:49:40
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param arr: [int[]] 정수 배열
	 *
	 * @return [double] 해답
	 */
	public double solution(int[] arr)
	{
		return (double) Arrays.stream(arr).sum() / arr.length;
	}
}
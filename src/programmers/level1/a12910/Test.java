package programmers.level1.a12910;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 14:08:59
 */
public class Test
{
	/**
	 * 메인 메서드
	 *
	 * @param args: [String[]] 파라미터
	 */
	public static void main(String[] args)
	{
		Solution solution = new Solution();
		
		System.out.println(Arrays.toString(solution.solution(new int[] { 5, 9, 7, 10 }, 5)));
		System.out.println(Arrays.toString(solution.solution(new int[] { 2, 36, 1, 3 }, 1)));
		System.out.println(Arrays.toString(solution.solution(new int[] { 3, 2, 6 }, 10)));
	}
}
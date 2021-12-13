package programmers.level1.a12950;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 22:12:23
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
		
		System.out.println(Arrays.deepToString(solution.solution(new int[][] { { 1, 2 }, { 2, 3 } }, new int[][] { { 3, 4 }, { 5, 6 } })));
		System.out.println(Arrays.deepToString(solution.solution(new int[][] { { 1 }, { 2 } }, new int[][] { { 3 }, { 4 } })));
	}
}
package programmers.level1.a42748;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 21:28:35
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
		
		System.out.println(Arrays.toString(solution.solution(new int[] { 1, 5, 2, 6, 3, 7, 4 }, new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } })));
	}
}
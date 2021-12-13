package programmers.level1.a12906;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 13:32:56
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
		
		System.out.println(Arrays.toString(solution.solution(new int[] { 1, 1, 3, 3, 0, 1, 1 })));
		System.out.println(Arrays.toString(solution.solution(new int[] { 4, 4, 4, 3, 3 })));
	}
}
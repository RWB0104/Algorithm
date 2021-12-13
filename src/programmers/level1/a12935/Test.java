package programmers.level1.a12935;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 19:20:27
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
		
		System.out.println(Arrays.toString(solution.solution(new int[] { 4, 3, 2, 1 })));
		System.out.println(Arrays.toString(solution.solution(new int[] { 10 })));
	}
}
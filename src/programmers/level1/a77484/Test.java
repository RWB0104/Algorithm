package programmers.level1.a77484;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.09 Thu 16:03:09
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
		
		System.out.println(Arrays.toString(solution.solution(new int[] { 44, 1, 0, 0, 31, 25 }, new int[] { 31, 10, 45, 1, 6, 19 })));
		System.out.println(Arrays.toString(solution.solution(new int[] { 0, 0, 0, 0, 0, 0 }, new int[] { 38, 19, 20, 40, 15, 25 })));
		System.out.println(Arrays.toString(solution.solution(new int[] { 45, 4, 35, 20, 3, 9 }, new int[] { 20, 9, 3, 45, 4, 35 })));
	}
}
package programmers.level1.a42840;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 21:43:26
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
		
		System.out.println(Arrays.toString(solution.solution(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(solution.solution(new int[] { 1, 3, 2, 4, 2 })));
	}
}
package programmers.level1.a42889;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.11 Sat 01:56:08
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
		
		System.out.println(Arrays.toString(solution.solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 })));
		System.out.println(Arrays.toString(solution.solution(4, new int[] { 4, 4, 4, 4, 4 })));
		System.out.println(Arrays.toString(solution.solution(5, new int[] { 4, 4, 4, 4, 4 })));
	}
}
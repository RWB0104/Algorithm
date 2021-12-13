package programmers.level1.a12940;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 19:33:08
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
		
		System.out.println(Arrays.toString(solution.solution(3, 12)));
		System.out.println(Arrays.toString(solution.solution(2, 5)));
		System.out.println(Arrays.toString(solution.solution(12, 18)));
	}
}
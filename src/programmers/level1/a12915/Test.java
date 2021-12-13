package programmers.level1.a12915;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 14:22:36
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
		
		System.out.println(Arrays.toString(solution.solution(new String[] { "sun", "bed", "car" }, 1)));
		System.out.println(Arrays.toString(solution.solution(new String[] { "abce", "abcd", "cdx" }, 2)));
	}
}
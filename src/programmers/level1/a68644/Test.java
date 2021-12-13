package programmers.level1.a68644;

import java.util.Arrays;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 03:19:39
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
		
		System.out.println(Arrays.toString(solution.solution(new int[] { 2, 1, 3, 4, 1 })));
		System.out.println(Arrays.toString(solution.solution(new int[] { 5, 0, 2, 7 })));
	}
}
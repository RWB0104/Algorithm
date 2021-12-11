package programmers.level1.a42862;

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
		
		System.out.println(solution.solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
		System.out.println(solution.solution(5, new int[] { 2, 4 }, new int[] { 3 }));
		System.out.println(solution.solution(3, new int[] { 3 }, new int[] { 1 }));
		System.out.println(solution.solution(5, new int[] { 2, 4 }, new int[] { 5, 3 }));
		System.out.println(solution.solution(5, new int[] { 4, 2 }, new int[] { 3, 5 }));
		System.out.println(solution.solution(5, new int[] { 1, 4, 5 }, new int[] { 1, 3, 5 }));
	}
}
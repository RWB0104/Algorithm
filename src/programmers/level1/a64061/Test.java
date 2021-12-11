package programmers.level1.a64061;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.09 Thu 21:40:58
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
		
		System.out.println(4 == solution.solution(new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 }, { 3, 5, 1, 3, 1 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 }));
		System.out.println(8 == solution.solution(new int[][] { { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 }, { 3, 3, 3, 3, 3 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 }));
		System.out.println(0 == solution.solution(new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } }, new int[] { 1, 5, 3, 5, 1, 2, 1, 4 }));
	}
}
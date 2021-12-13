package programmers.level1.a12982;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 03:07:33
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
		
		System.out.println(solution.solution(new int[] { 1, 3, 2, 5, 4 }, 9));
		System.out.println(solution.solution(new int[] { 2, 2, 3, 3 }, 10));
	}
}
package programmers.level1.a12912;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 14:16:50
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
		
		System.out.println(solution.solution(3, 5));
		System.out.println(solution.solution(3, 3));
		System.out.println(solution.solution(5, 3));
	}
}
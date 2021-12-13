package programmers.level1.a82612;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 16:43:20
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
		
		System.out.println(solution.solution(3, 20, 4));
		System.out.println(solution.solution(3, 120, 4));
		System.out.println(solution.solution(3, 30, 4));
	}
}
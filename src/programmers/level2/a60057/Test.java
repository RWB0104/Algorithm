package programmers.level2.a60057;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 23:00:15
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
		
		System.out.println(solution.solution("aabbaccc"));
		System.out.println(solution.solution("ababcdcdababcdcd"));
		System.out.println(solution.solution("abcabcdede"));
		System.out.println(solution.solution("abcabcabcabcdededededede"));
		System.out.println(solution.solution("xababcdcdababcdcd"));
	}
}
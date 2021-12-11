package programmers.level1.a42576;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 21:13:57
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
		
		System.out.println(solution.solution(new String[] { "leo", "kiki", "eden" }, new String[] { "eden", "kiki" }));
		System.out.println(solution.solution(new String[] { "marina", "josipa", "nikola", "vinko", "filipa" }, new String[] { "josipa", "filipa", "marina", "nikola" }));
		System.out.println(solution.solution(new String[] { "mislav", "stanko", "mislav", "ana" }, new String[] { "stanko", "ana", "mislav" }));
	}
}
package programmers.level1.a42576;

import java.util.HashMap;

/**
 * 완주하지 못한 선수 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 21:13:57
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param participant: [String[]] 참여한 선수
	 * @param completion: [String[]] 완주한 선수
	 *
	 * @return [String] 완주하지 못한 선수 이름
	 */
	public String solution(String[] participant, String[] completion)
	{
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String name : participant)
		{
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		
		for (String name : completion)
		{
			map.put(name, map.get(name) - 1);
		}
		
		for (String key : map.keySet())
		{
			// 값이 하나 이상 있을 경우
			if (map.get(key) > 0)
			{
				answer = key;
				break;
			}
		}
		
		return answer;
	}
}
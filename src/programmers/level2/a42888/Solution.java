package programmers.level2.a42888;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 오픈채팅방 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 23:00:15
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param record: [String[]] 닉네임 변경 기록
	 *
	 * @return [String[]] 해답
	 */
	public String[] solution(String[] record)
	{
		ArrayList<String[]> list = new ArrayList<>();
		
		HashMap<String, String> ids = new HashMap<>();
		
		for (String text : record)
		{
			String[] texts = text.split(" ");
			
			switch (texts[0])
			{
				case "Enter" -> {
					list.add(new String[] { texts[0], texts[1] });
					
					// ID가 이미 기록된 경우
					if (ids.containsKey(texts[1]))
					{
						ids.replace(texts[1], texts[2]);
					}
					
					// 아닐 경우
					else
					{
						ids.put(texts[1], texts[2]);
					}
				}
				case "Change" -> ids.replace(texts[1], texts[2]);
				case "Leave" -> list.add(new String[] { texts[0], texts[1] });
			}
		}
		
		return list.stream()
				.map(strings -> new StringBuilder(ids.get(strings[1])).append(strings[0].equals("Enter") ? "님이 들어왔습니다." : "님이 나갔습니다.").toString())
				.toArray(String[]::new);
	}
}
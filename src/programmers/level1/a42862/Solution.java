package programmers.level1.a42862;

import java.util.Arrays;

/**
 * 체육복 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 23:38:35
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [int] 전체 학생 수
	 * @param lost: [int[]] 체육복을 도난당한 학생
	 * @param reserve: [int[]] 체육복 여벌을 가진 학생
	 *
	 * @return [int] 체육 수업을 들을 수 있는 학생의 최대값
	 */
	public int solution(int n, int[] lost, int[] reserve)
	{
		int[] clothes = new int[n];
		
		// 자신의 앞뒤 사람에게만 빌려줄 수 있으므로 학생 번호 순서가 중요함
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		// 여벌 체육복을 가진 학생을 카운팅
		for (int item : reserve)
		{
			clothes[item - 1]++;
		}
		
		// 체육복을 도난당한 학생을 카운팅
		for (int item : lost)
		{
			clothes[item - 1]--;
		}
		
		for (int i = 0; i < clothes.length; i++)
		{
			// 도난당한 학생일 경우
			if (clothes[i] == -1)
			{
				// 첫 학생이 아니고, 앞 학생이 여벌을 가질 경우
				if (i != 0 && clothes[i - 1] == 1)
				{
					clothes[i - 1]--;
					clothes[i]++;
					
					continue;
				}
				
				// 마지막 학생이 아니고, 뒷 학생이 여벌을 가질 경우
				if (i != clothes.length - 1 && clothes[i + 1] == 1)
				{
					clothes[i + 1]--;
					clothes[i]++;
				}
			}
		}
		
		return Arrays.stream(clothes).filter(value -> value > -1).toArray().length;
	}
}
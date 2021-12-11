package programmers.level1.a67256;

/**
 * 키패드 누르기 클래스
 *
 * @author RWB
 * @since 2021.12.09 Thu 18:58:49
 */
class Solution
{
	private static final int[][] KEYPAD = new int[][] {
			{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9 },
			{ -2, 0, -1 }
	};
	
	private int left = -2;
	private int right = -1;
	
	/**
	 * 해답 반환 메서드
	 *
	 * @param numbers: [int[]] 순서대로 누를 번호
	 * @param hand: [String] 주 손잡이 (left, right)
	 *
	 * @return [String] 해답
	 */
	public String solution(int[] numbers, String hand)
	{
		StringBuilder builder = new StringBuilder();
		
		for (int number : numbers)
		{
			// 왼쪽 번호일 경우
			if (number == 1 || number == 4 || number == 7)
			{
				left = number;
				
				builder.append("L");
			}
			
			// 오른쪽 번호일 경우
			else if (number == 3 || number == 6 || number == 9)
			{
				right = number;
				
				builder.append("R");
			}
			
			// 가운데 번호일 경우
			else
			{
				int[] lPos = getPosition(left);
				int[] rPos = getPosition(right);
				int[] toPos = getPosition(number);
				
				int lLength = Math.abs(lPos[0] - toPos[0]) + Math.abs(lPos[1] - toPos[1]);
				int rLength = Math.abs(rPos[0] - toPos[0]) + Math.abs(rPos[1] - toPos[1]);
				
				// 왼쪽 엄지가 더 가까울 경우
				if (lLength > rLength)
				{
					right = number;
					
					builder.append("R");
				}
				
				// 오른쪽 엄지가 더 가까울 경우
				else if (lLength < rLength)
				{
					left = number;
					
					builder.append("L");
				}
				
				// 둘 다 동일할 경우
				else
				{
					// 왼손잡이일 경우
					if (hand.equals("left"))
					{
						left = number;
						
						builder.append("L");
					}
					
					// 오른손잡이일 경우
					else
					{
						right = number;
						
						builder.append("R");
					}
				}
			}
		}
		
		return builder.toString();
	}
	
	/**
	 * 위치 반환 메서드
	 *
	 * @param number: [int] 키
	 *
	 * @return [int[]] 위치
	 */
	private int[] getPosition(int number)
	{
		int[] pos = new int[] { 0, 0 };
		
		for (int i = 0; i < KEYPAD.length; i++)
		{
			for (int j = 0; j < KEYPAD[i].length; j++)
			{
				if (KEYPAD[i][j] == number)
				{
					pos[0] = i;
					pos[1] = j;
				}
			}
		}
		
		return pos;
	}
}
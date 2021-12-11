package programmers.level1.a64061;

import java.util.Stack;

/**
 * 크레인 인형뽑기 게임 클래스
 *
 * @author RWB
 * @since 2021.12.09 Thu 21:40:58
 */
class Solution
{
	private final Stack<Integer> bag = new Stack<>();
	
	/**
	 * 해답 반환 메서드
	 *
	 * @param board: [int[][]] 보드 크기
	 * @param moves: [int[]] 크레인 작동 위치
	 *
	 * @return [int] 해답
	 */
	public int solution(int[][] board, int[] moves)
	{
		int answer = 0;
		
		for (int move : moves)
		{
			int j = move - 1;
			
			for (int i = 0; i < board.length; i++)
			{
				// 인형을 뽑을 경우
				if (board[i][j] > 0)
				{
					// 뽑은 인형 수가 두 개 이상이고, 마지막 인형과 뽑은 인형이 같을 경우
					if (!bag.isEmpty() && bag.peek() == board[i][j])
					{
						bag.pop();
						
						answer += 2;
					}
					
					// 아닐 경우
					else
					{
						bag.push(board[i][j]);
					}
					
					board[i][j] = 0;
					
					break;
				}
			}
		}
		
		return answer;
	}
}
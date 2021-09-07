package beakjoon.all.a1021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 백준 전체 1021 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/08/26/a1021">1021 풀이</a>
 * @since 2021.08.26 00:48:27
 */
public class Main
{
	// 방향 Enum
	private enum DIRECTION
	{
		LEFT, RIGHT
	}
	
	// 뽑을 수의 갯수
	private static int M;
	
	// 큐
	private static final LinkedList<Integer> QUEUE = new LinkedList<>();
	
	/**
	 * 메인 함수
	 *
	 * @param args: [String[]] 매개변수
	 *
	 * @throws IOException 데이터 입출력 예외
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// N과 M
		int[] meta = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		// 수의 위치
		int[] position = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		// 큐의 크기
		int N = meta[0];
		
		M = meta[1];
		
		// 큐의 크기만큼 큐 초기화
		for (int i = 0; i < N; i++)
		{
			QUEUE.add(i + 1);
		}
		
		writer.write(String.valueOf(solve(position)));
		writer.newLine();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 큐 연산 갯수 반환 함수
	 *
	 * @param position: [int[]] 수의 위치 배열
	 *
	 * @return [int] 연산 갯수
	 */
	private static int solve(int[] position)
	{
		int count = 0;
		
		for (int i = 0; i < M; i++)
		{
			// 뽑을 요소의 인덱스
			int target = QUEUE.indexOf(position[i]);
			
			// 요소의 중간
			int mid = QUEUE.size() / 2;
			
			// 인덱스가 요소의 중간값을 넘을 경우 오른쪽이 더 빠름
			DIRECTION direction = target > mid ? DIRECTION.RIGHT : DIRECTION.LEFT;
			
			// 오른쪽으로 갈 경우 큐의 길이에서 인덱스를 빼서 역계산
			int distance = direction == DIRECTION.RIGHT ? QUEUE.size() - target : target;
			
			move(direction, distance);
			pop();
			
			// 이동 길이 누적
			count += distance;
		}
		
		return count;
	}
	
	/**
	 * 이동 함수
	 *
	 * @param direction: [DIRECTION] 방향 Enum
	 * @param distance: [int] 거리
	 */
	private static void move(DIRECTION direction, int distance)
	{
		// 왼쪽으로 이동할 경우
		if (DIRECTION.LEFT == direction)
		{
			for (int i = 0; i < distance; i++)
			{
				QUEUE.addLast(QUEUE.removeFirst());
				System.out.println(QUEUE);
			}
		}
		
		// 오른쪽으로 이동할 경우
		else
		{
			for (int i = 0; i < distance; i++)
			{
				QUEUE.addFirst(QUEUE.removeLast());
				System.out.println(QUEUE);
			}
		}
	}
	
	/**
	 * 삭제 함수
	 */
	private static void pop()
	{
		QUEUE.removeFirst();
	}
}
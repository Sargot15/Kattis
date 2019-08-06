package difficulty5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TenKindsOfPeople {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bi.readLine().split(" ");
		long time = System.currentTimeMillis();
		int rows = Integer.parseInt(data[0]);
		int cols = Integer.parseInt(data[1]);
		char[][] map = new char[rows][cols];
		for(int i = 0; i < rows; i++) {
			map[i] = bi.readLine().toCharArray();
		}
		int cases = Integer.parseInt(bi.readLine());
		for (int k = 0; k < cases; k++) {
			String[] coords = bi.readLine().split(" ");
			Coordinate start = new Coordinate(Integer.parseInt(coords[0]) - 1, Integer.parseInt(coords[1]) - 1);
			Coordinate end = new Coordinate(Integer.parseInt(coords[2]) - 1, Integer.parseInt(coords[3]) - 1);
			char kind = map[start.x][start.y];
			if (kind != map[end.x][end.y])
				System.out.println("neither");
			else {			
				boolean[][] visited = new boolean[rows][cols];
				PriorityQueue<Coordinate> toVisit = new PriorityQueue<Coordinate>(1000000, new MyComparator(end));
				toVisit.add(start);
				visited[start.x][start.y] = true;
				while (toVisit.size() > 0 && !visited[end.x][end.y]) {
					Coordinate actual = toVisit.poll();
					if (actual.x > 0 && map[actual.x - 1][actual.y] == kind && !visited[actual.x - 1][actual.y]) {
						Coordinate c = new Coordinate(actual.x - 1, actual.y);
						toVisit.add(c);
						visited[actual.x - 1][actual.y] = true;
					}
					if (actual.x < rows - 1 && map[actual.x + 1][actual.y] == kind && !visited[actual.x + 1][actual.y]) {
						Coordinate c = new Coordinate(actual.x + 1, actual.y);
						toVisit.add(c);
						visited[actual.x + 1][actual.y] = true;
					}
					if (actual.y > 0 && map[actual.x][actual.y - 1] == kind && !visited[actual.x][actual.y - 1]) {
						Coordinate c = new Coordinate(actual.x, actual.y - 1);
						toVisit.add(c);
						visited[actual.x][actual.y - 1] = true;
					}
					if (actual.y < cols - 1 && map[actual.x][actual.y + 1] == kind && !visited[actual.x][actual.y + 1]) {
						Coordinate c = new Coordinate(actual.x, actual.y + 1);
						toVisit.add(c);
						visited[actual.x][actual.y + 1] = true;
					}
				}
				if (visited[end.x][end.y])
					System.out.println(kind == '1' ? "decimal" : "binary");
				else 
					System.out.println("neither");
				System.out.println(System.currentTimeMillis() - time + " ms");
			}
		}
	}
}

class MyComparator implements Comparator<Coordinate>{
	Coordinate end;
	MyComparator(Coordinate end){
		this.end = end;
	}
	@Override
	public int compare(Coordinate arg0, Coordinate arg1) {
		int aToEnd = arg0.distanceTo(end);
		int bToEnd = arg1.distanceTo(end);
		if (aToEnd <= bToEnd)
			return aToEnd * 100000000 + arg0.x * 10000 + arg0.y;

		return bToEnd * 100000000 + arg1.x * 10000 + arg1.y;
	}
}

class Coordinate{
	public int x;
	public int y;
	
	Coordinate(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int distanceTo(Coordinate c) {
		return Math.abs(c.x - this.x) + Math.abs(c.y - this.y);
	}
}

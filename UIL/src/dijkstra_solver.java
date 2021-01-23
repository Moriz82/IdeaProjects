public class dijkstra_solver {
	public static void main(String[] args) {
		int nodes[][] = new int[][]{
				{0,4,2,0,0,0},
				{0,0,5,10,0,0},
				{0,0,0,0,3,0},
				{0,0,0,0,0,11},
				{0,0,0,4,0,0},
				{0,0,0,0,0,0}
		};

		boolean visited[]=new boolean[nodes.length];
		int pD[] = new int[nodes.length];
		int dist[] = new int[nodes.length];

		int minVal = 999;
		int nextNode = 0;

		for (int i = 0; i < nodes.length; i++) {
			for (int j = 0; j < dist.length; j++) {
				if (nodes[i][j]==0){
					nodes[i][j]=999;
				}
			}
		}

		dist=nodes[0];
		visited[0]=true;
		dist[0]=0;

		for (int count = 0; count < nodes.length; count++) {
			minVal=999;
			for (int i = 0; i < nodes.length; i++) {
				if (minVal>dist[i] && !visited[i]){
					minVal=dist[i];
					nextNode=i;
				}
			}

			visited[nextNode]=true;

			for (int i = 0; i < nodes.length; i++) {
				if (!visited[i]){
					if (minVal + nodes[nextNode][i] < dist[i]){
						dist[i] = minVal + nodes[nextNode][i];
					}
				}
			}
		}
		for (int i = 1; i < nodes.length; i++) {
			System.out.println("the distance from the "+(i+1)+" node is "+dist[i]+" from the start");
		}
		int count = 0;
		for(int i = 0; i < nodes.length; i++) {
			if (i != 0) {
				System.out.print("Path = " + i);
				count = i;

				while (count != 0) {
					count = pD[count];
					System.out.print(" <- " + count);

				}

			}
			System.out.println();
		}
	}
}


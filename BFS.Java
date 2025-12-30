class Main {
	int vert;
	int[][] adj;
	Main(int vert) {
		this.vert = vert;
		adj = new int[vert][vert];
	}
	void Addedge(int u, int v) {
		adj[u][v] = 1;
		adj[v][u] = 1;
	}

	void display() {
		System.out.println("Adj Matrix : ");
		for(int i = 0; i < vert; i++) {
			for(int j = 0; j < vert; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}

	void DFS(int start) {
		boolean[] visited = new boolean[vert];
		System.out.println("DFS Treversal : ");
		DFSHelper(start, visited);

	}

	void Bfs(int start) { // 4
		boolean[] visited = new boolean[vert];
		int[] q = new int[vert];

		int front = 0 ;
		int rear= 0;
		
		visited[start] = true;
		q[rear++] = start ;

		while(front < rear) {
			int node = q[front++];
			System.out.println(node);

			for(int i = 0; i < vert ; i++) {
				if(adj[node][i] == 1 && !visited[i]) {
					visited[i] = true;
					q[rear++] = i;
				}
			}
		}
	}

	void DFSHelper(int node, boolean[] visited) {
		visited[node] = true;
		System.out.println(node + " ");

		for(int i = 0; i < vert ; i++) {
			if(adj[node][i] == 1 && !visited[i]) {
				DFSHelper(i, visited);
			}
		}
	}
	public static void main (String[] args) {
		Main m = new Main(5);
		m.Addedge(0, 1);
		m.Addedge(1, 2);
		m.Addedge(2, 4);
		m.Addedge(3, 4);
		//m.display();

		//m.DFS(0);		
		m.Bfs(4);

	}

}

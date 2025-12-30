class DoubleLinkedList {
	Node head;
	String name;
	DoubleLinkedList(String name) {
		head = null;
		this.name = name;
	}

	void display() {
		if(head == null) {
			System.out.println("List is empty ....");
		}else{
		    Node tempHead = head;
		    while(tempHead != null) {
		        System.out.print(tempHead.data + " --> ");
				tempHead = tempHead.rlink;
			}
			System.out.print(" Null ");
		}
	}
	void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.rlink = head;
			head.llink = newNode;
			head = newNode;
		}
	}
	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node tempHead = head;
			while(tempHead.rlink != null) {
				tempHead = tempHead.rlink;
			}
			tempHead.rlink = newNode;
			newNode.llink = tempHead;
		}
	}
	void insertAtMid(int target, int data) {
		if(head == null) {
			System.out.println("List is empty ....");
		} else if(head.data == target) {
			this.insertAtBegin(data);
		} else {
			Node newNode = new Node(data);

			Node current = head;
			Node prev = null;

			while(current != null) {
				if(current.data == target) {
					newNode.rlink = current;
					current.llink = newNode;
					prev.rlink = newNode;
					newNode.llink = prev;
				class Main{
    int vert;
    int[][] adj;
    Main(int vert){
        this.vert = vert;
        adj = new int[vert][vert];
    }
    void Addedge(int u , int v){
        adj[u][v] = 1;
        adj[v][u] = 1;
    }  
    
    void display(){
        System.out.println("Adj Matrix : ");
        for(int i = 0; i < vert;i++){
            for(int j = 0; j < vert;j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    void DFS(int start){
        boolean[] visited = new boolean[vert];
        System.out.println("DFS Treversal : ");
        DFSHelper(start , visited);

    }
    
     void DFSHelper(int node , boolean[] visited){
        visited[node] = true;
        System.out.println(node + " ");
         
        for(int i = 0; i < vert ; i++){
            if(adj[node][i] == 1 && !visited[i]){
                DFSHelper(i , visited);
            }
        }
     }
    public static void main (String[] args) {
        Main m = new Main(4);
        m.Addedge(0 , 1);
        m.Addedge(1 , 2);
        m.Addedge(2 , 3);
        // m.Addedge(3 , 4);
        m.display();
        
        m.DFS(2);
        
    }
    
}

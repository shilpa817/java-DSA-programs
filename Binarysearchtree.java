
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
class binarytree{
	Node root;
	binarytree(){
		root=null;
	}
    Node insert( Node root,int data ) {
		if(root==null) {
		return new Node(data);
		}
		if(data<=root.data) {
			root.left=insert(root.left,data);
		}
		else {
			root.right=insert(root.right,data);

		}
		return root;	
	}
    Node delete(Node root,int target) {
    	if(target<root.data) {
			root.left=delete(root.left,target);
		}
		else if(target>root.data){
			root.right=delete(root.right,target);
		}
		else {
			if(root.left==null&&root.right==null) 
	          return null;
			if(root.left==null) {
				root=root.right;
			}
			if(root.right==null) {
				root=root.left;
			}
			
		 }
		return root;
    }
    
    
	void display(Node root) {
		if(root!=null) {
		display(root.left);
		System.out.print(" "+root.data);
		display(root.right);
	}
}
	void display1(Node root) {
		if(root!=null) {
		System.out.println(" "+root.data);
		display1(root.left);
		display1(root.right);
	}
}
	void display2(Node root) {
		if(root!=null) {
		display2(root.left);
		display2(root.right);
		System.out.print(" "+root.data);
	}
}
}
 class Main {
	public static void main(String[] args) {
		/*Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(10);
	    Node root = n1;
		n1.right=n2;
		n1.left =n3;
		System.out.println(root);
		System.out.println(root.data);
		System.out.println(n2.left.right);
*/
		binarytree bs=new binarytree();
		bs.root=bs.insert(bs.root, 32);
		bs.root=bs.insert(bs.root, 12);
		bs.root=bs.insert(bs.root, 10);
		bs.root=bs.insert(bs.root, 56);
		bs.root=bs.insert(bs.root, 42);
		bs.root=bs.insert(bs.root, 62);
		bs.root=bs.delete(bs.root, 10);
		bs.display(bs.root);
		bs.display1(bs.root);
		bs.display2(bs.root);

			}
}
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
					return;
				}
				prev = current ;
				current = current.rlink;
			}
		}
	}
	void Delete(int target) {
    if (head == null) {
        System.out.println("List is empty ....");
        return;
    }

    // If head node is to be deleted
    if (head.data == target) {
        head = head.rlink;
        if (head != null) {
            head.llink = null;
        }
        return;
    }

    Node temp = head;

    while (temp != null) {
        if (temp.data == target) {

            // If not last node
            if (temp.rlink != null) {
                temp.rlink.llink = temp.llink;
            }

            // Link previous node
            temp.llink.rlink = temp.rlink;

            return;
        }
        temp = temp.rlink;
    }
	}
}


class Main {
	public static void main (String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList("DoubleLinkedList");
		dll.insertAtBegin(10);
		dll.insertAtBegin(5);
		dll.insertAtBegin(1);
		dll.insertAtEnd(15);
		dll.insertAtEnd(20);
		dll.insertAtMid(15 , 12);
		dll.Delete(15);
        dll.display();
	}
}

class Node {
	int data;
	Node llink;
	Node rlink;
	Node(int data) {
		this.data = data;
		llink = null;
		rlink = null;
	}
}
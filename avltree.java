

class AVL {
    Node root;

    int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    int balanceFactor(Node node) {
        return (node == null) ? 0 : height(node.llink) - height(node.rlink);
    }

    Node rightRotate(Node y) {
        Node x = y.llink;
        Node t = x.rlink;

        x.rlink = y;
        y.llink = t;

        y.height = Math.max(height(y.llink), height(y.rlink)) + 1;
        x.height = Math.max(height(x.llink), height(x.rlink)) + 1;

        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.rlink;
        Node t = y.llink;

        y.llink = x;
        x.rlink = t;

        x.height = Math.max(height(x.llink), height(x.rlink)) + 1;
        y.height = Math.max(height(y.llink), height(y.rlink)) + 1;

        return y;
    }

    Node insert(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (data < node.data)
            node.llink = insert(node.llink, data);
        else if (data > node.data)
            node.rlink = insert(node.rlink, data);
        else
            return node;

        node.height = 1 + Math.max(height(node.llink), height(node.rlink));
        int balance = balanceFactor(node);

        // LL
        if (balance > 1 && data < node.llink.data)
            return rightRotate(node);

        // RR
        if (balance < -1 && data > node.rlink.data)
            return leftRotate(node);

        // LR
        if (balance > 1 && data > node.llink.data) {
            node.llink = leftRotate(node.llink);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && data < node.rlink.data) {
            node.rlink = rightRotate(node.rlink);
            return leftRotate(node);
        }

        return node;
    }

    Node minValue(Node node) {
        Node current = node;
        while (current.llink != null)
            current = current.llink;
        return current;
    }

    Node delete(Node node, int key) {
        if (node == null)
            return node;

        if (key < node.data)
            node.llink = delete(node.llink, key);
        else if (key > node.data)
            node.rlink = delete(node.rlink, key);
        else {
            if ((node.llink == null) || (node.rlink == null)) {
                Node temp = (node.llink != null) ? node.llink : node.rlink;

                if (temp == null) {
                    node = null;
                } else {
                    node = temp;
                }
            } else {
                Node temp = minValue(node.rlink);
                node.data = temp.data;
                node.rlink = delete(node.rlink, temp.data);
            }
        }

        if (node == null)
            return node;

        node.height = Math.max(height(node.llink), height(node.rlink)) + 1;
        int balance = balanceFactor(node);

        // LL
        if (balance > 1 && balanceFactor(node.llink) >= 0)
            return rightRotate(node);

        // LR
        if (balance > 1 && balanceFactor(node.llink) < 0) {
            node.llink = leftRotate(node.llink);
            return rightRotate(node);
        }

        // RR
        if (balance < -1 && balanceFactor(node.rlink) <= 0)
            return leftRotate(node);

        // RL
        if (balance < -1 && balanceFactor(node.rlink) > 0) {
            node.rlink = rightRotate(node.rlink);
            return leftRotate(node);
        }

        return node;
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.llink);
            preOrder(node.rlink);
        }
    }
}

class Node {
    int data, height;
    Node llink, rlink;

    Node(int data) {
        this.data = data;
        this.height = 1;
    }
}

public class Main{
	public static void main(String[] args) {
        AVL tree = new AVL();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        tree.root = tree.delete(tree.root, 40);

        tree.preOrder(tree.root);
    }
}






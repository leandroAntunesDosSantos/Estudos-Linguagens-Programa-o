class Node{
    int key;
    Node left,right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}


public class BinarySearchTree {
        Node root;

        BinarySearchTree(){
            root = null;
        }

        void insert(int key){
            root = insertRec(root,key);
        }

        Node insertRec(Node root, int key){
            if (root == null){
                root = new Node(key);
                return root;
            }

            if (key < root.key){
                root.left = insertRec(root.left, key);
            }else if (key > root.key){
                root.right = insertRec(root.right, key);
            }
            return root;
        }

        void inOrderTraversal(){
            inOrderTraversalRec(root);
        }

        void inOrderTraversalRec(Node root){
            if (root != null){
                inOrderTraversalRec(root.left);
                System.out.print(root.key + " ");
                inOrderTraversalRec(root.right);
            }
        }

        boolean search(int key){
            return searchRec(root, key);
        }

        boolean searchRec(Node root, int key){
            if (root == null){
                return false;
            }
            if (root.key == key){
                return true;
            }
            if (key < root.key){
                return searchRec(root.left, key);
            }else {
                return searchRec(root.right, key);
            }
        }

        public static void main(String[] args){
            BinarySearchTree tree = new BinarySearchTree();

            tree.insert(20);
            tree.insert(30);
            tree.insert(10);
            tree.insert(40);
            tree.insert(42);
            tree.insert(5);

            System.out.println("Arvore ordenada: ");
            tree.inOrderTraversal();

            if (tree.search(33)){
                System.out.println("Chave encontrada ");
            }else {
                System.out.println("Chave não encontrada ");
            }
        }
}

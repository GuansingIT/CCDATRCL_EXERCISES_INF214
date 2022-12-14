public class BinaryTree{

    public static void main(String[] args) {
    
    // Create root node A
        Node ownr = new Node("Ivan Guansing");
        // Create node B
        Node ceo = new Node("Jenny Balmoja");
        // Create node C
        Node rm = new Node("Elaine Palmero");
        // Create node D
        Node stmngr = new Node("Ron Lazaro");
        // Create node E
        Node ndmngr = new Node("Keith De Solidad");
        // Create node F
        Node rdmngr = new Node("Rachelle Santos");
        // Create node G
        Node thmngr = new Node("Carl Acero");

        // Set left and right child of root node A
        ownr.left = ceo;
        ownr.right = rm;

        // Set left and right child of node B
        ceo.left = stmngr;
        ceo.right = ndmngr;

        // Set left and right child of node C
        rm.left = rdmngr;
        rm.right = thmngr;
        
        System.out.println("\nPre Order Traversal: ");
             traversePreOrder(ownr);
        System.out.println("\nIn Order Traversal: ");
             traverseInOrder(ownr);
        System.out.println("\nPost Order Traversal: ");
             traversePostOrder(ownr);
     }
         void traverseInOrder(Node clss){
         if (clss !=null) {
             traverseInOrder(clss.left);
             System.out.println(" " + clss.office);
             traverseInOrder(clss.right);
         }
     }
         void traversePreOrder(Node clss){
         if (clss !=null) {
             System.out.println(" " + clss.office);
             traversePreOrder(clss.left);
             traversePreOrder(clss.right);
         }
     }
        void traversePostOrder(Node clss){
         if (clss !=null) {
             traversePostOrder(clss.left);
             traversePostOrder(clss.right);
             System.out.println(" " + clss.office);
            }
    }
}

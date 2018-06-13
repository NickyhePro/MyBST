
/**
 *
 * @author Nick He
 */
public class MyBST {
    
    public static void main(String[] args) {
        
        //Create my BST
        BinarySearchTree myTree = new BinarySearchTree();
        
        //Add some elements into my BST
        myTree.add(1, "abc");
        myTree.add(0, "qwe");
        myTree.add(3, "aseeeeeda");
        myTree.add(4, "123");
        myTree.add(1, "asda");
        myTree.add(5, "5555");
       
        //Get the value of the particular key
        myTree.get(1);
        myTree.get(9);
        
        //Get the height of the tree
        System.out.println("The height of the tree is: "+myTree.treeHeight(myTree.root));
        
        //Return the keySet
        myTree.keySet().forEach(s -> System.out.print(s+", "));
        System.out.println("");
        
        //Return the valueSet
        myTree.valueSet().forEach(s -> System.out.print(s+", "));
        System.out.println("");
        
        //Return the entrySet
        myTree.entrySet().forEach(s -> System.out.print(s+", "));
        
        BinarySearchTree myTree2 = new BinarySearchTree();
        myTree2.add(1, "");
        System.out.println("");
        System.out.println("My tree height: "+myTree2.treeHeight(myTree2.root));
    }
}

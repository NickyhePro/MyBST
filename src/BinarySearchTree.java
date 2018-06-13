
import java.util.*;

/**
 *
 * @author Nick He
 */
public class BinarySearchTree {

    public BSTNode root = null;
    public int count = 0;
    private Set keySet;
    private Set valueSet;
    private Set entrySet;

    // pre: root and value are non-null
    // post: returned: 1 - existing tree node with the desired value, or
    // 2 - the node to which value should be added
    protected BSTNode locate(BSTNode root, int key)
    {
        int rootKey = root.getData().getKey();
        BSTNode child = null;

        if (rootKey == key) {
            return root;
        }
        
        if (rootKey < key) {
            child = root.right();
        } else if (rootKey > key) {
            child = root.left();
        }
        
        if (child == null) {
            return root;
        } else {
            return locate(child, key);
        }

    }

    protected BSTNode predecessor(BSTNode root) {
        if (root != null) {
            System.out.println("No predecessor to middle value.");
            //return null;
        }
        if (root.left != null) {
            System.out.println("Root has left child.");
        }

        BSTNode result = root.left();
        while (result.right != null) {
            result = result.right();
        }
        return result;
    }

    // post: adds an entry to binary search tree
    public void add(int key, String value) 
    {

        BSTNode newNode = new BSTNode(new Association(key, value));
        if (root == null) {
            root = newNode;
        } else {
            if (contains(key)) {
                locate(root, key).getData().getValue().add(value);
                return;
            } else 
            {
                BSTNode insertLocation = locate(root, key);
                int nodeKey = insertLocation.getData().getKey();
                if (nodeKey < key) {
                    insertLocation.setRight(newNode);
                } else if (nodeKey > key) {
                    if (insertLocation.left != null) {
                        predecessor(insertLocation).setRight(newNode);
                    } else {
                        insertLocation.setLeft(newNode);
                    }
                }
                newNode.setParent(insertLocation);
            }
            count++;
        }
    }
    
    /**
     * Return the values matched to the particular 
     * key if exists.
     * 
     * @param key
     * @return 
     */
    public List<String> get(int key)
    {
        if(root == null)
        {
            System.out.println("No any elements in the tree.");
            return null;
        }else
        {
            if(contains(key))
            {
                List<String> matchedValue = locate(root, key).getData().getValue();
                System.out.print("Values found: ");
                matchedValue.forEach(s -> System.out.print(s+", "));
                System.out.println("");
                return matchedValue;
            }else
            {
                System.out.println("No matched key stored in this tree.");
                return null;
            }
        }
    }

    /**
     * Search a particular key in the tree and return
     * the result if it exists.
     * 
     * @param key
     * @return 
     */
    public boolean contains(int key) {
        BSTNode possibleLocation = locate(root, key);
        return possibleLocation.getData().getKey() == key;
    }
    
    /**
     * Return the height of this tree
     * 
     * @param node
     * @return 
     */
    public int treeHeight(BSTNode node)
    {
        if(node == null)
        {
            return -1;
        }else
        {
            int leftHeight = treeHeight(node.left);
            int rightHeight = treeHeight(node.right);
            if(leftHeight > rightHeight)
            {
                return  leftHeight+1;
            }else
            {
                return rightHeight+1;
            }
        }
    }
    
    /**
     * Return the keySet of the tree
     * 
     * @return 
     */
    public Set keySet() {
        keySet = new HashSet();
        getKeySet(root);
        
        return keySet;
    }

    /**
     * Return the entrySet of the tree
     * 
     * @return 
     */
    public Set entrySet() 
    {
        entrySet = new TreeSet();
        getEntrySet(root);
        
        return entrySet;
    }

    /**
     * Return the valueSet of the tree
     * 
     * @return 
     */
    public Set valueSet()
    {
        valueSet = new HashSet();
        getValueSet(root);
        
        return valueSet;
    }
    
    /**
     * Add the key into keySet
     * 
     * @param node 
     */
    public void getKeySet(BSTNode node)
    {   
        if (node==null)
            return;
        
        getKeySet(node.left);
        keySet.add(node.getData().getKey());
        getKeySet(node.right);
        
    }
    
    /**
     * Add the values into valueSet
     * 
     * @param node 
     */
    public void getValueSet(BSTNode node)
    {   
        if (node==null)
            return;
        
        getValueSet(node.left);
        valueSet.add(node.getData().getValue().toString());
        getValueSet(node.right);
        
    }
     
    /**
     * Add entries into entrySet
     * 
     * @param node 
     */
    public void getEntrySet(BSTNode node)
    {   
        if (node==null)
            return;
        
        getEntrySet(node.left);
        entrySet.add((String)"("+ node.getData().getKey()+","+node.getData().getValue().toString()+")");
        getEntrySet(node.right);
        
    }
}

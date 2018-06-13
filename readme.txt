Here are some tips to implement this program:

*This program can only take integers as key and strings as values.*

There are some methods in BinarySearchTree class you may want to use:

1.protected BSTNode locate(BSTNode root, int key)
It returns existing tree node with the desired value, or the node 
to which value should be added

2.public void add(int key, String value) 
Add an entry to the binary search tree

3.public List<String> get(int key)
Return the values matched to the particular key if exists.

4.public boolean contains(int key)
Search a particular key in the tree and return the result if it exists.

5.public int treeHeight(BSTNode node)
Return the height of this tree.

6.public Set keySet()
Return the keySet of the tree.

7.public Set entrySet() 
Return the entrySet of the tree.

8.public Set valueSet()
Return the valueSet of the tree.
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick He
 */
public class BSTNode {

    public Association data;
    public BSTNode parent;
    public BSTNode left;
    public BSTNode right;

    public BSTNode() {
        data = null;
        parent = left = right = null;
    }

    public BSTNode(Association val) {
        data = val;
        parent = null;
        left = right = null;
    }

    public BSTNode(Association val, BSTNode p) {
        data = val;
        parent = p;
        left = right = null;
    }

    public BSTNode(Association val, BSTNode l, BSTNode r) {
        data = val;
        parent = null;
        left = l;
        right = r;
    }

    // post: returns reference to (possibly empty) left subtree
    public BSTNode left() {
        return this.left;
    }

    // post: returns reference to (possibly empty) left subtree
    public BSTNode right() {
        return this.right;
    }

    // post: returns reference to parent node, or null
    public BSTNode parent() {
        return this.parent;
    }

    // post: sets left subtree to newLeft
    public void setLeft(BSTNode newLeft) {
        this.left = newLeft;

    }

    // post: sets right subtree to newRight
    public void setRight(BSTNode newRight) {
        this.right = newRight;
    }

    // post: re-parents this node to parent reference, or null
    public void setParent(BSTNode newParent) {
        this.parent = newParent;
    }

    // post: returns true if this is a left child of parent
    public boolean isLeftChild() {
        if (this.parent.left == this) {
            return true;
        } else {
            return false;
        }
    }

    // post: returns true if this is a left child of parent
    public boolean isRightChild() {
        if (this.parent.right == this) {
            return true;
        } else {
            return false;
        }
    }

    // post: returns value associated with this node
    public Association getData() 
    {
        return this.data;
    }

}

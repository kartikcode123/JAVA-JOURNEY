package trees;

import java.util.ArrayList;

class BinaryTree{
    ArrayList<Integer> ll=new ArrayList<>();
      public static class Node{  
        int data;  
        Node left;  
        Node right;  
  
        public Node(int data){  
            //Assign data to the new node, set left and right children to null  
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
      }  
  
      //Represent the root of binary tree  
      public Node root;  
  
      public BinaryTree(){  
          root = null;  
      }  
  
      //insert() will add new node to the binary search tree  
      public void insert(int data) {  
          //Create a new node  
          Node newNode = new Node(data);  
  
          //Check whether tree is empty  
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
              //current node point to root of the tree  
              Node current = root, parent = null;  
  
              while(true) {  
                  //parent keep track of the parent node of current node.  
                  parent = current;  
  
                  //If data is less than current's data, node will be inserted to the left of tree  
                  if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  //If data is greater than current's data, node will be inserted to the right of tree  
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
        }

    
    public void inorderTraversal(Node node) {  
  
          //Check whether tree is empty  
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left); 
                  ll.add(node.data); 
              System.out.print(node.data + " ");  
              if(node.right!= null)  
                  inorderTraversal(node.right);  
  
          }  
      }
      public void search(Node root,int key){
        int curr=root.data;
        while(root!=null){
            if(key<root.data){
                curr=root.data;
                root=root.left;
            }else if(key>root.data){
                curr=root.data;
                root=root.right;
            }else if(key==root.data){
                System.out.println("the root for the given key "+key+" is"+curr);
                return;
            }else{
                System.out.println("element not present");
            }
        }
      }  
      public int kthlargest(Node root,int k){
        if(root==null){
            return -999;
        }
        inorderTraversal(root);
        return ll.get(ll.size()-k);

      }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        BinaryTree bl=new BinaryTree();
         bl.insert(50);
         bl.insert(40);
         bl.insert(60);
         bl.insert(45);
    bl.inorderTraversal(bl.root);
    bl.search(bl.root,45);
    System.out.println(bl.kthlargest(bl.root, 2));
    
    }
}
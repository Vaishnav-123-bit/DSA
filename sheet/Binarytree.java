import java.util.*;
public class Binarytree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void Inorder(Node root){
        if(root==null){
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void LevelOrder(Node root){
        if(root==null){
            return ;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);
        return leftNodes+rightNodes+1;
    }

    public static int sumNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumNodes(root.left);
        int rightsum=sumNodes(root.right);
        return leftsum+rightsum+root.data;
    }

    public static int heightTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=heightTree(root.left);
        int rightHeight=heightTree(root.right);
        int myHeight=Math.max(leftHeight,rightHeight) +1;
        return myHeight;
    }



    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);

        preorder(root);
        System.out.println(" ");
        Inorder(root);
        System.out.println(" ");
        Postorder(root);

        System.out.println();
        System.out.println();


        LevelOrder(root);
        System.out.println(countNodes(root));
        System.out.println(sumNodes(root));
        System.out.println(heightTree(root));
    }

}
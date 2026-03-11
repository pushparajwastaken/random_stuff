
class AVL {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
     public Node(int value){
        this.value=value;
    }
     public int getValue(){
        return value;
     }
    }
  private Node root;
  public AVL(){

  }
  public int height(Node node){
    if (node ==null){
        return -1;
    }
    return node.height;
  }
  public int height(){
    return (root.height);
  }
  public boolean isEmpty(){
    return root==null;
  }
  public void display(){
display(root,"Root Node : ");
  }
  private void display(Node node,String details){
if(node== null)return ;
System.out.println(details+node.getValue());
display(node.left,"Left child of "+node.getValue()+ " : ");
display(node.right,"Right child of "+node.getValue()+ " : ");
  }
public void insert(int value){
 root= insert( value,root);

}

private Node insert(int value,Node node){
  if(node==null){
     node=new Node(value);
     return node;
  }
 
if(value<node.value){
  node.left=insert(value,node.left);
}
if(value>node.value){
  node.right=insert(value,node.right);
}
node.height=Math.max(height(node.left),height(node.right))+1;
return rotate(node);
}
private Node rotate(Node node){
    //if height of left-height of right is more than 1,it means our tree is left heavy
    if(height(node.left)-height(node.right)>1){
        //left heavy
        if(height(node.left.left)-height(node.left.right)>0){
            //left left case
            return rightRotate(node);
        }
        if(height(node.left.left)-height(node.left.right)<0){
            //left right case
            node.left=leftrotate(node.left);
            return rightRotate(node);
        }
    }
if(height(node.left)-height(node.right)<-1){
    //right heavy
    if(height(node.right.right)-height(node.right.left)>0){
        return leftrotate(node);
    }
     if(height(node.right.right)-height(node.right.left)<0){
        node.right= rightRotate(node.left);
        return leftrotate(node);
    }
}
return node;
}


private Node rightRotate(Node node){
Node c=node.left;
Node t=c.right;
c.right=node;
node.left=t;
node.height=Math.max(height(node.left),height(node.right))+1;
c.height=Math.max(height(c.left),height(c.right))+1;
return c;
}
private Node leftrotate(Node node){
Node p=node.right;
Node t=p.left;
p.left=node;
node.right=t;
node.height=Math.max(height(node.left),height(node.right ))+1;
p.height=Math.max(height(p.left),height(p.right))+1;
return p;
}





public boolean balanced(){
  return balanced(root);
}
private boolean balanced(Node node){
  if(node == null)return true;
  return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right) ;
}

public void populate(int []nums){
  for(int i=0;i<nums.length;i++){
    this.insert(nums[i]);
  }
}
public void populateSorted(int []nums){
  populateSorted(nums,0,nums.length);
}
private void populateSorted(int[]nums,int start,int n){
  if(start>=n){
    return ;
  }
  int mid=(start +n)/2;
  this.insert(nums[mid]);
  populateSorted(nums,start,mid);
  populateSorted(nums,mid+1,n);
  //time complexity:-n(logn)

}

//Preorder Traversal(ro-le-ri)-used for evaluating expression or making a copy or serialization
public void preOrder(){
  preOrder(root);
}
private void preOrder(Node node){
  if(node==null )return;
  System.out.println(node.value+" ");
  preOrder(node.left);
  preOrder(node.right);
}
//inorder(le-ro-ri)-in bst we get sorted order
//postorder(le-ri-ro)-when we need to delete from binary tree
public static void main(String[] args) {
AVL tree=new AVL ();
for(int i=0;i<1000;i++)
    {
        tree.insert(i);
    }
    System.out.println(tree.height());
}
}

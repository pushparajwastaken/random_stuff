public class ST{
    public static void main(String[] args) {
        int[]arr={1,2,3,3,2,222,1222,34,-33,-43,-112};
        ST st=new ST(arr);
        st.display();
    }
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
    
    public Node (int startInterval,int endInterval){
        this.startInterval=startInterval;
        this.endInterval=endInterval;
    }
}
Node root;
public ST(int []arr){
    //create a tree using this arr
    this.root=constructTree(arr,0,arr.length-1);
};
private Node constructTree(int[]arr,int start,int end){
    if(start ==end){
        //creating leaf node
        Node leaf=new Node(start,end);
        leaf.data=arr[start];
        return leaf;
    }
    Node node=new Node(start,end);
    int mid=(start+end)/2;
    node.left=this.constructTree(arr, start, mid);
    node.right=this.constructTree(arr, mid+1, end);
    node.data=node.left.data+node.right.data;
    return node;
}
public void display(){
    display(root);
}
private void display(Node root){
    if(root==null){
        return;
    }
    System.out.println(root.data);
    display(root.left);
    display(root.right);
}
public int query(int qsi,int qei){
    return this.query(this.root,qsi,qei);
}
private int query(Node node,int     qsi,int     qei){
    if(node.startInterval>=qsi && node.endInterval<=qei){
        //Node is completely inside the interval
        return node.data;
    }else if(node.startInterval>qei || node.endInterval<qsi){
        //completely outside 
        return 0;
    }
    else{
        return this.query(node.left,qsi, qei)+this.query(node.right,qsi, qei)
    }
}
public void update(int index,int value){
    this.root.data=update(root,index, value);
}
private int update(Node node,int index,int value){
    if(index>=node.startInterval && index<=node.endInterval){
if(index==node.startInterval && index== node.endInterval){
    node.data=value;
    return node.data;
}
else{
    int leftAns=update(node.left, index, value);
    int rightAns=update(node.right, index, value);
    node.data=leftAns+rightAns;
    return node.data;
}
    }
return node.data;
}
}
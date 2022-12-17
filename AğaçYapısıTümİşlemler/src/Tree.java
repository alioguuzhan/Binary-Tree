// create tree
public class Tree {
    static class Node{
        int value;
        Node left,right;
        
        Node(int value){
            this.value=value;
            left=null;
            right=null;
        }
    }
    //insert a node to tree
    public void insert (Node node, int value){
        if (value<node.value) {
            if (node.left != null) {
                insert(node.left,value);
            }
            else{
                node.left=new Node (value);
            }
        }
        else if (value> node.value) {
            if (node.right != null) {
                insert(node.right,value);
            }
            else{
                node.right=new Node (value);
            }
        }
    }
    // in order search
    public void inorder(Node node){
            if (node !=null) {
                inorder(node.left);
                System.out.print(" "+node.value);
                inorder(node.right);
            }
    }
    //post order search
    public void postorder(Node node){
        if (node !=null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(" "+node.value);
        }
    }
    // pre order search
    public void preorder(Node node){
        if (node != null) {
            System.out.print(" "+node.value);
            postorder(node.left);
            postorder(node.right);
        }
    }
    // min value in tree
    static Node min(Node kok){
        while(kok.left != null){
            kok=kok.left;
            System.out.print("");
        }
        return kok;
    }
    //max value in tree
    static Node max(Node kok){
        while  (kok.right != null) {
            kok=kok.right;
            System.out.print("");
        }
        return kok;
    }
    // value search
    static Node ara(Node kok, int sayi){
       while(kok!=null){
           if (sayi==kok.value) {
               return kok;
           }
           else if (sayi< kok.value) {
               kok=kok.left;
               System.out.print("");
           }
           else{
               kok=kok.right;
               System.out.print("");
           }
       }
       return null;
   }
    public static void main (String [] args ){
        Tree tree=new Tree();
        Node root=new Node(23);
        System.out.println("Oluşturulan ağacın root'u"+root.value);
        
        tree.insert(root, 23);
        tree.insert(root,95);
        tree.insert(root,87);
        tree.insert(root,41);
        tree.insert(root,10);
        tree.insert(root,11);
        tree.insert(root,180);
        tree.insert(root,57);
        tree.insert(root,82);
        tree.insert(root,34);
        tree.insert(root,63);
        tree.insert(root,101);
        tree.insert(root,77);
        tree.insert(root,93);
        tree.insert(root,28);
        tree.insert(root,25);
        tree.insert(root,31);
        tree.insert(root,72);
        tree.insert(root,93);
       
        System.out.println("Pre Order");
        tree.preorder(root);
        System.out.println("");
        System.out.println("Post Order");
        tree.postorder(root);
        System.out.println("");
        System.out.println("In Order");
        tree.inorder(root);
        System.out.println("");
        
        Node value_min= min(root);
        System.out.println("Min value= " + value_min.value); 
        
        Node value_max= max(root);
        System.out.println("Max value= " + value_max.value); 
        
        int sought_value=28;
        Node sonuc= ara(root,sought_value);

        if(sonuc!=null)
        System.out.println("Sought Value=" + sonuc.value);
        else
        System.out.println("Not found");
        
        
        
    }
}

/**
 * @param <T>
 * NodeArrayList.java
 * AUTHORS: Henry, Jack Greco, Jack Hughes
 * DATE: 10-9-20
 * PURPOSE: An arrayList-like class made of linked nodes using Hughes' node class
 */

public class NodeArrayList <T>{
    private int size;
    private Node<T> ancestorNode;

    public NodeArrayList(){
        this.size = 1;
        this.ancestorNode = new Node<T>();
    }

    //RETURN FALSE IF AN ERROR OCCURS
    public boolean add(T data){
        try{
            //Determine most recently added node/last in chain
            Node curNode = ancestorNode;
            for(int i = 0; i <= size; i++){
                curNode = curNode.getChild();
            }
            //Create new node with data
            Node newNode = new Node(data);
            newNode.setParent(curNode);
        }
        catch(Exception e){
            //Some exception occurred
            return false;
        }
        //No exceptions occurred
        return true;
    }

    //Add data at index
    public void add(int index, T data){
        //Determine most recently added node/last in chain
        Node curNode = ancestorNode;
        for(int i = 0; i < index; i++){
            curNode = curNode.getChild();
        }
        //Create new node with data
        Node newNode = new Node(data);
        newNode.setParent(curNode);
    }

    public T remove(int index){

    }

    public T get(int index){

    }

    public T set(int index, T data){

    }

    public int size(){
        return this.size;
    }
}


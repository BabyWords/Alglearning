public class Stack<Item> {
    private Node first;
    private int N;
    private class  Node{
        Item item;
        Node next;
    }
    public boolean isEmpty(){
        return first ==null;
    }
    public int size(){
        return N;
    }
    public  void push(Item item){
        Node oldfirst=first;
        first=new Node();
        first.next=oldfirst;
        N++;
    }
    public Item pop(){
        first=first.next;
        Item item=first.item;
        N--;
        return item;
    }
}

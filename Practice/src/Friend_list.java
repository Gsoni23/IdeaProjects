class Friend{
    String name;
    String no;
    Friend next;
    static Friend list;

    public static void print(){
        Friend friend = list;
        if (friend == null) System.out.println("The list is Empty");
        else do {
            System.out.println(friend);
            friend = friend.next;
        }while (friend != null);
        }
        public Friend(String name,String no){
        this.name=name;
        this.no=no;
        this.next=list;
        list=this;
    }

    @Override
    public String toString() {
        return new String (name + " : "+no);
    }
}
public class Friend_list {
    public static void main(String[] args) {
        Friend.print();
        new Friend("Baba","9414835283");
        new Friend("Touji","9414289567");
        new Friend("Papa","9414441482");
        new Friend("Mumy","9461577716");
        new Friend("Chunmun","7627040532");
        new Friend("Govind","9460289105");
        Friend.print();

    }
}

package DataStructure.demo07;

public class YLinkList implements  YList{
    private YLinkList Node;
    private YLinkList next;
    private Object date;

    public YLinkList getNode() {
        return Node;
    }

    public void setNode(YLinkList node) {
        Node = node;
    }

    public YLinkList getNext() {
        return next;
    }

    public void setNext(YLinkList next) {
        this.next = next;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }
    public YLinkList(){

    }
    public YLinkList(Object date) {
        this.date = date;
    }

    @Override
    public void clear() {//清空
        this.Node=null;

    }

    @Override
    public boolean isEmpty() {//查找是否为空
        if(Node==null||Node.next==null){

        return false;
    }
        return true;
    }

    @Override
    public int length() {//查找链表长度
        YLinkList p=Node;
        int lenght=1;
        while(p.next!=null){
            p=p.next;
            lenght++;
        }
        return lenght;
    }

    @Override
    public Object get(int i)  {//按位查找
        YLinkList p=Node;
        if(i>length()){
            System.out.println("数字超出范围");
        }else {
            if (i == 1) {

            }else {

                for (int i1 = 1; i1 < i; i1++) {
                    p = p.next;

                }

            }
        }


        return p.date;
    }

    @Override
    public void insert(Object x) { //有序插入
        YLinkList yLinkList=new YLinkList(x);
        YLinkList p= Node;
        if(Node==null){
            Node=yLinkList;
            Node.next=null;
        }
        else{
            while(p.next!=null){
                p=p.next;
            }
            p.next=yLinkList;
            yLinkList.next=null;

        }


    }

    @Override
    public void insert(int i, Object x) {//按位插入
        YLinkList yLinkList=new YLinkList(x);
        YLinkList p=Node;
        if(Node==null){
            Node=yLinkList;
            Node.next=null;
        }else{
            if(i==1){
                yLinkList.next=p;
                Node=yLinkList;
            }else{
            for (int i1 = 1; i1 < i; i1++) {
                yLinkList.next=p.next;
                p.next=yLinkList;


            }

        }
        }


    }

    @Override
    public void remove(int i) { //按位移除
        YLinkList p=Node;
        YLinkList p1 =null;
        if(i>length()){
            System.out.println("数字超出范围");
        }else {
            if (i == 1) {
                Node = p.next;
            }else {

                for (int i1 = 1; i1 < i; i1++) {
                    p1 = p;
                    p = p.next;

                }
                p1.next = p.next;


            }
        }
    }

    @Override
    public int indexOf(Object x) {//按值查找
        YLinkList p=Node;
        int a=0;
        while(p!=null&&p.date.equals(x)){
            p=p.next;
            a++;
        }
        if(p!=null){
            return a;
        }else

        return -1;
    }

    @Override
    public void display() {//遍历
        YLinkList p=Node;
        while(p.next!=null){
            System.out.print(p.date+" ");
            p=p.next;
        }
        System.out.println(p.date);

    }

    @Override
    public void JDNZ() {//就地逆置
        YLinkList list=new YLinkList();
        YLinkList p=Node;
        while(p.next!=null){
            list.insert(1,p.date);
            p=p.next;
        }
        list.insert(1,p.date);
        clear();
        Node=list.Node;


    }
    public void connect(YLinkList x) {//合并
        YLinkList p=Node;
        while(p.next!=null){
            p=p.next;

        }
        p.next=x.Node;



    }
    @Override
    public void JO() { //奇偶分开
        YLinkList J1=new YLinkList();
        YLinkList O1=new YLinkList();
        YLinkList p=Node;
        while(p.next!=null){

            if((Integer.parseInt(String.valueOf(p.date)))%2==0){
                O1.insert(p.date);
            }else{
                J1.insert(p.date);
            }
            p=p.next;
        }
        if((Integer.parseInt(String.valueOf(p.date)))%2==0){
            O1.insert(p.date);
        }else{
            J1.insert(p.date);
        }
        clear();
        J1.connect(O1);
        Node=J1.Node;


    }
    public void JO1() { //奇偶分开



    }

    @Override
    public void duplicate() {//消除重复
        for (int i=1;i< length();i++){
            for(int j= length();j>i;j--){
                if(get(j).equals(get(i))){
                    remove(j);
                }
            }
        }
        display();



    }

}

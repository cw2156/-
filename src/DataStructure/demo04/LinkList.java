package DataStructure.demo04;

import org.w3c.dom.Node;

public class LinkList implements List {
    public LinkList head = null;
    private Object data;
    private LinkList next;
    private int count;
    public LinkList() {
        this.count = 0;
    }
    public LinkList(Object data) {
        this.data = data;
    }
    public void clear() {
        this.head = null;


    }
    @Override
    public boolean isEmpty() {
        LinkList p = head;
        if (p == null) {
            return false;
        }
        if (p.next == null) {
            return false;
        } else

            return true;
    }
    @Override
    public int length() {
        int lenght = 1;
        LinkList curNode = head;
        while (curNode.next != head) {
            lenght++;
            curNode = curNode.next;
        }
        return lenght;
    }
    @Override
    public Object get(int i) {
        LinkList p = head;
        int j = 1;
        while (p != null && j < i) {
            p = p.next;
            j++;
        }
        if (p == null || j > i) {
            System.out.println("出错");
        }
        return p.data;
    }
    @Override
    public void insert(Object x) {
        LinkList linkList = new LinkList(x);
        if (head == null) {
            this.head = linkList;
            linkList.next = head;
            return;
        }
        LinkList temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = linkList;
        linkList.next = head;
        this.count++;
    }
    public void insert(int i, Object x)  {
        LinkList linkList = new LinkList(x);
        LinkList p = head;
        if (i == 1) {
            linkList.next = p;
            head = linkList;
            p.next=head;
        } else {
            int j = 1;
            while (p != null && j < i - 1) {
                p = p.next;
                j++;
            }
            if (p == null || j > i)
            {
                System.out.println("有错误");
            }
            else {
                linkList.next = p.next;
                p.next = linkList;

            }
        }
    }
    @Override
    public void remove(int i) {
        LinkList p = head;
        LinkList p1;
        int j = 2;
        if (i == 1) {
            head = head.next;
        } else {
            while (p != null && j < i) {
                p = p.next;
                j++;
            }
            if (p == null || j > i) {
                System.out.println("过量");//throw new Exception("no position");
            } else {
                p1 = p.next;
                p.next = p1.next;
                p1.next = null;
            }
        }
    }
    @Override
    public int indexOf(Object x) {
        LinkList p = head;
        int j = 1;
        while (p != null && !p.data.equals(x)) {
            p = p.next;
            j++;
        }
        if (p != null)
            return j;
        else
            return -1;
    }
    @Override
    public void display() {
        LinkList temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data + " ");
    }
    public void connect(LinkList x) {
        LinkList p = head;
        LinkList p1 = x.head;
        while (p.next != head) {
            p = p.next;
        }
        p.next = p1;
        while (p1.next!=x.head){
            p1=p1.next;
        }
        p1.next=head;

    }
    public void delete(Object x) {
        int a = indexOf(x);
        if (a != -1) {
            remove(a);
        } else {
            System.out.println("没有找到数据");
        }
    }
    public void JO() throws Exception {
        LinkList p=head;
        int  a=1;
        while (p.next!=head){
            if(Integer.parseInt((String)p.data)%2==0){
                p=p.next;

            }else{

                remove(a);
                insert( 1,p.data);
                p=p.next;

                System.out.println("12312312");
            }

            a++;

        }
        display();

    }

}

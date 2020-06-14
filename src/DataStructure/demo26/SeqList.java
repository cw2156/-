package DataStructure.demo26;

public class SeqList {
    public RecordNode [] r;    //顺序表记录结点数组
    public int curlen;        //顺序表长度,即记录个数
    public RecordNode[] getRecord() {
        return r;
    }
    public void setRecord(RecordNode[] r) {
        this.r = r;
    }
    public SeqList(){}
    // 顺序表的构造方法，构造一个存储空间容量为maxSize的顺序表
    public SeqList(int maxSize) {
        this.r = new RecordNode[maxSize];  // 为顺序表分配maxSize个存储单元
        this.curlen = 0;                   // 置顺序表的当前长度为0
    }
    // 求顺序表中的数据元素个数并由函数返回其值
    public int length() {
        return curlen; // 返回顺序表的当前长度
    }
    public void insert(int i,RecordNode x)throws Exception{
        if(curlen==r.length){
            throw new Exception("顺序表已经满了");

        }
        if(i<0||i>curlen){
            throw new Exception("插入的位置不合理");

        }
        for (int j=curlen;j>i;j--){
            r[j]=r[j-1];
        }
        r[i]=x;
        this.curlen++;
    }
    public void print(){
        for (RecordNode i : r) {
            System.out.print(i);
        }
        System.out.println(" ");
    }
    //直接插入排序
    public  void insertSort(){
        RecordNode temp;
        int i,j;
        for (i = 1; i < this.curlen; i++) {

            temp=r[i];
            for (j=i-1;j>=0&&temp.key.compareTo(r[j].key)<0;j--){
                r[j+1]=r[j];

            }
            r[j+1]=temp;

        }

    }
    //冒泡排序。以上浮为基本点.相邻的交换
    public void  bubbleSort(){
        RecordNode temp;
        boolean flag=true;
        for (int i=1;i<this.curlen && flag;i++){//排列次数
            flag=false;//看着的
            for(int j=0;j<this.curlen- i;j++){
            if(r[j].key.compareTo(r[j+1].key)>0){
                temp=r[j];
                r[j]=r[j+1];
                r[j+1]=temp;
                flag=true;
            }
            }
        }

    }
    //快速排序
    public int Partition(int i,int j){
        RecordNode pivot =r[i];
        while(i>j){
            while(i<j && pivot.key.compareTo(r[j].key)<=0){
                j--;
            }
            if(i<j){
                r[i]=r[j];
                i++;
            }
            while(i<j && pivot.key.compareTo(r[i].key)>0){
                i++;
            }
            if(i<j){
                r[j]=r[i];
                j--;
            }
        }
        r[i]=pivot;
        return i;
    }
//简单的选择排序
    public void selectSort(){
        RecordNode temp;
        int j,i;
        for (i=0;i<this.curlen-1;i++){
            int min=i;
            for (j=i+1;j<this.curlen;j++){
                if(r[j].key.compareTo(r[i].key)<0){
                    min=j;
                }

            }
            if(min!=i) {
                temp=r[min];
                r[j] = r[i];
                r[i] = temp;
            }
        }

    }



}

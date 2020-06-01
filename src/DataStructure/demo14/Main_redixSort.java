package DataStructure.demo14;


public class Main_redixSort {
    public static void main(String[] args) {
        redixSort sortInstance = new redixSort();
        int[] data = { 1, 4, 3, 3, 21, 12, 44, 123,765, 56, 65, 39};
        sortInstance.sort(data);
        for(int i=0;i<data.length;i++)
            System.out.print(data[i]+" ");
    }
}


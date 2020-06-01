package DataStructure.demo14;

import java.util.*;
public class redixSort {
    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
    public void sort(int[] a) {
        int N = 10;
        ArrayList<Queue<Integer>> qArray;
        qArray = new ArrayList();
        for (int i = 0; i < N; i++)
            qArray.add(new<Integer> LinkedList());// 开辟空间
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
            max = Integer.max(max, a[i]);
        int[] length = new int[N];// 记录qArray的原始长度，防止对元素重复操作
        // radix sort
        for (int i = 0; i < a.length; i++)
            qArray.get(a[i] % 10).offer(a[i]);// 1 step
        for (int j = 10; j <= max; j *= 10) {
            for (int i = 0; i < N; i++)
                length[i] = qArray.get(i).size(); // 2 step update length
            for (int i = 0; i < N; i++) {
                Queue<Integer> q = qArray.get(i);
                while (length[i]-- > 0) {
                    int num = q.poll();
                    qArray.get((num / j) % 10).offer(num);
                }
            }
        }
        for (int i = 0, AIndex = 0; i < N; i++) // finally
            while (qArray.get(i).size() > 0)
                a[AIndex++] = qArray.get(i).poll();
    }
}

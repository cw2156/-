package DataStructure.demo17;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import DataStructure.demo16.LinkQueue;



public class BSort {

        public static LinkQueue  rt(String number) throws Exception {
            String str = "([+-]?[\\d]+[,]?)+";
            Pattern pattern = Pattern.compile(str);
            LinkQueue arr = new LinkQueue();
            Matcher matcher = pattern.matcher(number);
            if (matcher.matches()) {
                String[] strNumGroup = number.split(",");
                for (String strEvery : strNumGroup) {
                    arr.offer(Integer.valueOf(strEvery));
                }
            }
            return arr;
        }

        public static LinkQueue buckety(LinkQueue linkQueue) throws Exception {
            int[] a = new int[linkQueue.length() - 1];
            LinkQueue buckety[] = new LinkQueue[10];
            for (int i = 0; i < 10; i++) {
                buckety[i] = new LinkQueue();
            }
            LinkQueue t = new LinkQueue();
            for (int k = 1; k <= 2; k++) {
                for (int i = 0; i < 10; i++)
                    buckety[i].clear();
                int j = 0;
                while (linkQueue.peek() != null) {
                    a[j] = Integer.valueOf(linkQueue.poll().toString());
                    j++;
                }
                for (int i = 0; i < a.length; i++) {
                    int r = getFigure(a[i], k);
                    buckety[r].offer(a[i]);
                }
                for (int i = 0; i < 10; i++) {
                    while (buckety[i].peek() != null) {
                        linkQueue.offer(buckety[i].poll());
                    }
                }
            }
            return linkQueue;
        }

        public static int getFigure(int b, int k) {
            int[] c = {1, 10};
            return (b / c[k - 1]) % 10;
        }

        /*   public static void main(String[] args) throws Exception {
               Scanner scanner = new Scanner(System.in);
               LinkQueue tm = rt(scanner.next());
               System.out.println(tm.length());
               while (tm.peek() != null) {
                   System.out.println(tm.poll());
               }
           }*/
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            LinkQueue tm = rt(scanner.next());
            while (buckety(tm).peek() != null) {
                System.out.print(buckety(tm).poll()+" ");
            }
        }
    }



package DataStructure.demo22;

public class dome {
    public static void main(String[] args) {
        int []W={11,22,33,44,55,66,77};
        HuffmanTree T=new HuffmanTree();
        int [] []HN=T.huffmanCoding(W);
        System.out.println("哈夫曼树");
        for (int i = 0; i < HN.length; i++) {
            for (int j=0;j<HN[i].length;j++){
                if(HN[i][j]==-1){
                    for (int k=j+1;k<HN[i].length;k++)
                        System.out.println(HN[i][k]);
                    break;

                }
            }
            System.out.println();

        }
    }
}

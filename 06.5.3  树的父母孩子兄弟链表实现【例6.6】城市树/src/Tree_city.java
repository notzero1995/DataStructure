//《数据结构（Java版）（第4版）》，作者：叶核亚，2014年7月23日
//6.5.3   树的父母孩子兄弟链表实现
//【例6.6】 以树（森林）的横向凹入表示构造树。

public class Tree_city
{
    public static void main(String[] args)
    {
        String prelist[]={"A","\tB","\t\tE","\t\tF","\tC","\t\tG","\t\t\tK","\t\t\tL","\tD","\t\tH","\t\tI","\t\tJ"}; //图6.34，树
//        String prelist[]={"A","\tB","\t\tE","\t\tF","\tC","\tD","\t\tG","H","\tI","\t\tJ"};//图6.36a，森林
//        String prelist[]={"中国","\t北京","\t江苏","\t\t南京","\t\t苏州","\t浙江","韩国","\t首尔"};//【例6.6】 图6.38，城市树，森林

/*        String prelist[]={"中国","\t北京","\t上海","\t江苏","\t\t南京","\t\t\t江宁","\t\t苏州",
                "\t\t无锡","\t\t\t锡山","\t浙江","\t\t杭州","\t\t宁波","\t\t温州","\t广东","\t\t广州",
                "韩国","\t首尔","法国","意大利","美国","\t华盛顿","\t纽约州","\t\t纽约"};*/

        Tree<String> tree = Trees.create(prelist);         //以树的横向凹入表示法构造树（森林）
        tree.preorder();                                   //输出树的先根次序遍历序列
        tree.postorder();                                  //输出树的后根次序遍历序列
        System.out.print(tree.toString());                 //先根次序遍历树并输出树的横向凹入表示字符串
    }
}
/*
程序运行结果如下：
                                                 //图6.34，树
树的先根次序遍历序列：  A B E F C G K L D H I J 
树的后根次序遍历序列：  E F B K L G C H I J D A 
树的横向凹入表示： 
 A
    B
        E
        F
    C
        G
            K
            L
    D
        H
        I
        J
树的广义表表示：A(B(E,F),C(G(K,L)),D(H,I,J))
树中所有从叶子结点到根的路径为： (E,B,A)，(F,B,A)，(K,G,C,A)，(L,G,C,A)，(H,D,A)，(I,D,A)，(J,D,A)，

                                                 //图6.36a，森林
树的先根次序遍历序列：  A B E F C D G H I J 
树的后根次序遍历序列：  E F B C G D A J I H 
树的横向凹入表示： 
 A
    B
        E
        F
    C
    D
        G
H
    I
        J
树的广义表表示：A(B(E,F),C,D(G)),H(I(J))
树中所有从叶子结点到根的路径为： (E,B,A)，(F,B,A)，(C,A)，(G,D,A)，(J,I,H)，

                                                 //【例6.6】 图6.38
先根次序遍历树：
 中国
    北京
    江苏
        南京
        苏州
    浙江
韩国
    首尔
树的广义表表示：中国(北京,江苏(南京,苏州),浙江),韩国(首尔)
树中所有从叶子结点到根的路径为： (北京,中国)，(南京,江苏,中国)，(苏州,江苏,中国)，(浙江,中国)，(首尔,韩国)，


先根次序遍历树： 
中国
  北京
  上海
  江苏
      南京
          江宁
      苏州
      无锡
          锡山
  浙江
      杭州
      宁波
      温州
  广东
      广州
韩国
  首尔
法国
意大利
美国
  华盛顿
  纽约州
      纽约
树的广义表表示：中国(北京,上海,江苏(南京(江宁),苏州,无锡(锡山)),浙江(杭州,宁波,温州),广东(广州)),韩国(首尔),法国,意大利,美国(华盛顿,纽约州(纽约))
树中所有从叶子结点到根的路径为： (北京,中国)，(上海,中国)，(江宁,南京,江苏,中国)，(苏州,江苏,中国)，(锡山,无锡,江苏,中国)，(杭州,浙江,中国)，(宁波,浙江,中国)，(温州,浙江,中国)，(广州,广东,中国)，(首尔,韩国)，(法国)，(意大利)，(华盛顿,美国)，(纽约,纽约州,美国)，

*/
//@author  Yeheya。2015-3-6



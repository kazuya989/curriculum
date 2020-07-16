/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data = {3,1,2,7,5};                                  /*int型のdataを値3,1,2,7,5で初期化*/
        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < 5; i++){                   /*int型iの値を０に初期化し、５より大きくなるまで、iに１を足し続ける*/
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {                 /*int型iを0で初期化し５より大きくなるまで１を足し続ける*/
            for (int j = 4; j > i; j--) {             /*int型jを４で初期化しjの値がiより大きい場合はjから1を引き続ける*/
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[i] > data[j]){  /*もしiがjより大きかったら*/
                  int box = data[i];                  /*int型のboxにiを飛ばす*/
                  data[i] = data[j];    /*iの部分が開いたためjを代入する*/
                  data[j] = box;                     /*jの値が二つある状態なので元々のjの部分にiを代入する*/
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}
public class HelloClass {

    public static void main (String[] args) {

        // *********************************************
        // コンソールに解りやすく出力する為のクラス
        // *********************************************
        ConsoleFormat cf = new ConsoleFormat( "-" );

        cf.border();
        cf.println("【変数の処理】");

        cf.title("int 変数の内容", 10);
        int a1;
        a1 = 12345;
        cf.println(a1);

        cf.title("String 変数の内容", 10);
        String a2;
        a2 = "日本語";
        cf.println(a2);

        cf.title("String.format で文字列編集", 10);
        String a3 = String.format("整数 a1 => %d になって 文字列 a2 => %s になりました",  a1, a2 );
        cf.println(a3);
        cf.border();
        System.out.print( "\n\n" );


        // *********************************************
        // ここから クラスメソッド
        // *********************************************
        ConFormat.border();
        ConFormat.println("【変数の処理】");

        ConFormat.title("int 変数の内容", 10);
        ConFormat.println(a1);

        ConFormat.title("String 変数の内容", 10);
        ConFormat.println(a2);

        ConFormat.title("String.format で文字列編集", 10);
        String a4 = String.format("整数 a1 => %d になって 文字列 a2 => %s になりました",  a1, a2 );
        ConFormat.println(a4);
        ConFormat.border();
        System.out.print( "\n\n" );

    }
}

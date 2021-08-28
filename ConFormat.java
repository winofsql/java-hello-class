public class ConFormat {

    // 文字列出力
    public static void println( String s ) {
        System.out.println( String.format( "> %s", s ) );
    }
    // 整数出力
    public static void println( int a ) {
        System.out.println( String.format( "? %d", a ) );
    }

    // 1文字を繰り返した文字列の取得
    public static String rep( String target, int n ) {

        StringBuilder sb = new StringBuilder();
        for( int i = 0; i < n; i++ ) {
            sb.append(target);
        }
        return sb.toString();
    }

    // タイトル部分の出力
    public static void title( String title, int n ) {

        StringBuilder sb = new StringBuilder();
        sb.append(rep( "*", n ) );
        sb.append( " " );
        sb.append( title );
        sb.append( " " );
        sb.append(rep( "*", n ) );
        System.out.println( sb.toString() );
       
    }

    // 処理ブロックを明示する為の表示
    public static void border(){
        System.out.println( rep("=", 60 ) );
    }    

}

public class ConsoleFormat {

    private String titleChar;

    // コンストラクタ
    public ConsoleFormat( String titleChar ) {
        this.titleChar = titleChar;
    }

    // 文字列出力
    public  void println( String s ) {
        System.out.println( String.format( "> %s", s ) );
    }
    // 整数出力
    public  void println( int a ) {
        System.out.println( String.format( "? %d", a ) );
    }

    // 1文字を繰り返した文字列の取得
    public  String rep( String target, int n ) {

        StringBuilder sb = new StringBuilder();
        for( int i = 0; i < n; i++ ) {
            sb.append(target);
        }
        return sb.toString();
    }

    // タイトル部分の出力
    public  void title( String title, int n ) {

        StringBuilder sb = new StringBuilder();
        sb.append(rep( titleChar, n ) );
        sb.append( " " );
        sb.append( title );
        sb.append( " " );
        sb.append(rep( titleChar, n ) );
        System.out.println( sb.toString() );
       
    }

    // 処理ブロックを明示する為の表示
    public  void border(){
        System.out.println( rep("=", 60 ) );
    }    

}

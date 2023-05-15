package RefactorIF1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Data_Type {
    private List<Integer> codes = new ArrayList<Integer>(){{
        add(20); add(21);
        add(23); add(24);
        add(26); add(700);
        add(701); add(790);
        add(1700); add(2202);
        add(2203); add(2204);
        add(2205); add(2206);
        add(3734); add(3769);
        add(12396); add(702);
        add(1082); add(1083);
        add(1114); add(1184);
        add(1266); add(12403);
    }};

    public static void main(String[] args) {
        System.out.println(Data_Type.gd(20));
        System.out.println(Data_Type.gd(702));
        System.out.println(Data_Type.gd(0));
    }
    public static String gd(int code){
        if(
                code == 702 ||
                        code == 1082 ||
                        code == 1083 ||
                        code == 1114 ||
                        code == 1184 ||
                        code == 1266 ||
                        code == 12403
        ){
            return "DATE";
        } else if (
                code == 20 ||
                        code == 21 ||
                        code == 23 ||
                        code == 24 ||
                        code == 26 ||
                        code == 700 ||
                        code == 701 ||
                        code == 790 ||
                        code == 1700 ||
                        code == 2202 ||
                        code == 2203 ||
                        code == 2204 ||
                        code == 2205 ||
                        code == 2206 ||
                        code == 3734 ||
                        code == 3769 ||
                        code == 12396
        ){
            return "NUMERIC";
        } else {
            return "STRING";
        }
    }
}

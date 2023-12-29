package Day_78;

import java.util.ArrayList;

public class FactorAtPthIndex {
    public static void main(String[] args) {
        int p = 3;
        int n = 10;
        System.out.println(factAtP(n, p));

    }
    public static int factAtP(int n, int p){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                list.add(i);
            }
        }
        if(p<list.size()){
            return list.get(p-1);
        }else {
            return 0;
        }

    }
}

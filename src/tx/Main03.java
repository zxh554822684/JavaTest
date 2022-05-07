package tx;

import java.util.*;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //T测试数据的组数
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            //n游戏的个数
            int n = sc.nextInt();
            int[] time = new int[n];
            int[] score = new int[n];
            //hashmap用来保存每个时刻的扣除的最大荣耀积分
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                time[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                score[j] = sc.nextInt();

                if (!map.containsKey(time[j])) {
                    map.put(time[j],score[j]);
                }else {
                    int scoreInt = map.get(time[j]);
                    if (scoreInt < score[j]){
                        map.put(time[j],score[j]);
                    }
                }

            }

            int minScore = 0;
            for (int t = 0; t < n; t++) {
                if(score[t] == map.get(time[t])) continue;
                else minScore += score[t];
            }

            // System.out.println(minScore);
            list.add(minScore);
        }

        for (int a : list) {
            System.out.println(a);
        }
    }

}

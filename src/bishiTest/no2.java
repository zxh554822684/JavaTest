package bishiTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> list = maxSubIncreaseArray(arr);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> maxSubIncreaseArray(int[] array){
        int[] list = new int[array.length];
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        int index = -1;
        int maxIndex = 0;
        int max = Integer.MIN_VALUE;
        list[0] = 1;
        tmp.add(array[0]);
        res.add(tmp);
        for(int i=1;i<array.length;i++){
            index = -1;
            tmp = new ArrayList<Integer>();
            for(int j=0;j<i;j++){
                if(array[j]<array[i]&&list[j]>list[i]){
                    list[i] = list[j];
                    index = j;
                }
            }
            ++list[i];
            if(index>-1)
                tmp.addAll(res.get(index));
            tmp.add(array[i]);
            res.add(tmp);
            if(list[i]>max){
                max = list[i];
                maxIndex = i;
            }
        }
        return res.get(maxIndex);
    }
}

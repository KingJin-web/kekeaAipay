package com.util;

import java.util.Scanner;

class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cost = scanner.nextInt();
        int man,woman,child;
        int flag = 0;
        for(man = 0; man < n; man++){
            for (woman = 0; woman < n; woman++) {
                for (child = 0; child < n; child++){
                    if (man*3 + woman*2 +child*1 == cost && man + woman + child == n){
                        System.out.println(man+" "+woman+" "+child);
                        flag = 1;
                    }
                }
            }
        }
        if(flag == 0){
            System.out.println("No answer");
        }
    }
}

package com.wavin.algorithm;

import java.util.Date;

/**
 * @Project : Algorithm
 * @Package : com.wavin.algorithm
 * @Author : TANG
 * @Date : 2021/5/3 22:12
 * @Type : Class
 * @Description : TODO
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int left, int right, int value){
        if(left > right || left < 0 || right > arr.length) {
            return -1;
        }
        int center = left + (right - left) / 2;
        if(value < arr[center]){
            return binarySearch(arr, 0, center, value);
        }else if(value > arr[center]){
            return binarySearch(arr, center,right,value);
        }
        return center;
    }


    public static int binarySearch2(int[] arr, int value){
        int start = 0;
        int end = arr.length - 1;

        int center = -1;
        while(start <= end){
            center = start + (end - start) / 2;
            if(arr[center] < value){
                start = center + 1;
            }else if(arr[center] > value){
                end = center - 1;
            }else{
                break;
            }
        }
        return center;
    }

    public static void main(String[] args) {
        int[] p = {0,1,1,2,2,2,3,3,4,5,6,7,8,9,10,11,14,15,18,19,22,25};
        Date startTime = new Date();
        System.out.println(startTime.getTime());
        System.out.println(binarySearch(p, 0, p.length, 1));
        Date endTime1 = new Date();
        System.out.println(endTime1.getTime());
        System.out.println(binarySearch2(p, 1));
        Date endTime2 = new Date();
        System.out.println(endTime2.getTime());
    }

}

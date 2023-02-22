

class MidEle{

     static void middle(int[]arr){
        int mid = (arr.length-1)/2;
        System.out.println(arr[mid]);
    }

    public static void main(String[] args) {
     int[]arr  = {1,2,3,4,5};
     middle(arr);  
    }
}
class SecondLargestElement{
    public static void main(String args[]){
        int arr[5]={2,5,7,3,9};
        
        int max=arr[0];
        //int maxValue;
        for(int i=0;i<5;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        int second=max;

        if(second<arr[i] && second>arr[i]) {
            second=arr[i];
        }
        }
        System.out.println(second);
    }
}
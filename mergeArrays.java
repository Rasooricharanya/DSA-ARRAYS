public class mergeArrays{
    public static void alternately(int a1[],int a2[]){
        int n1 = a1.length;
        int n2 = a2.length;
        int i =0;
        while(i<n1 || i<n2){
            if(i<n1){
                System.out.print(a1[i] +" " );
            }
            if(i<n2){
                System.out.print(a2[i]+ " ");
              
            }
            i++;
          

            

        }
        return;
    }
    public static void main(String[] args){
        int a1[] = {1,3,5,7};
        int a2[] = {2,4,6,8};
        alternately(a1,a2);
    }

}
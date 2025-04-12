public class majorityElement{
    public static int mostfre(int a[]){
        int majority = a[0];
        int votes = 1;
        for(int i=1;i<a.length;i++){
            if(votes == 0){
                votes++;
                majority = a[i];
            }
            else if(majority == a[i]){
                votes++;
            }
            else{
                votes--;
            }
            
        }
        return majority;
    }
    public static void main(String[] args) {
        int a[] = {6,5,5};
        System.out.println(mostfre(a));
    }
}

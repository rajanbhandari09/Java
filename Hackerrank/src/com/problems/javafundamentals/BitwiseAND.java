/*Bitwise AND operator*/

public class BitwiseAND{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            findMaxAND(n,k);
        }
    }
    
    public static void findMaxAND(int n, int k){
        int max =0;
        int temp =0;
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                temp = i&j;
                if(temp>max&&temp<k)
                    max = temp;
                
            }
            
        }
        
        System.out.println(max);
        
        
    }
}
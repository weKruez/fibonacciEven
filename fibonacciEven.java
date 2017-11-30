public class fibonacciEven {
    public static void main(String[] args) {
        
        int u = 0;
        int t = 0;
        int j = 1;
        int y = 2;
        
    for(int d = 0; d < 10; d++){
      
        u = j + y;
        t = u + y;
        
            
        }
        
        
        System.out.println(u);
        System.out.println(t);
        
        
        int countEven = 0;
        
        for(int i = 0; i <= 4000000; i++){
        {
            if(i%2 == 0)
                countEven++;   
            }
        }
        
        System.out.println(countEven);
        
    }
}


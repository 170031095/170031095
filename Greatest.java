public class Greatest { 
      
    final static int N = 3; 
    final static int  M = 3 ;  
    static int findMax(int mat[][]) 
    { 
  
        
        int maxElement = Integer.MIN_VALUE;  
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < M; j++) { 
                if (mat[i][j] > maxElement) { 
                    maxElement = mat[i][j]; 
                } 
            } 
        } 
        return maxElement; 
    } 
  
      
    public static void main(String args[]) 
    { 
          
        int mat[][] = { { 1, 23,45 }, 
                          { 55,121,222 }, 
                          { 56,77,89 }
                         }; 
  
        System.out.println(findMax(mat)) ; 
    
    } 
   
} 
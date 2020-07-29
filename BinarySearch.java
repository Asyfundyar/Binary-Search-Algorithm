public class binarySearch {  

	public static void main(String args[]){  
        
        int array[] = {1, 2, 3, 4, 5, 6}; //For this alogorithm to work, the list must be sorted.
        int key = 4;  //The key is what this program will try to find and print the index of.
        int high = array.length - 1;
        
        binarySearch(array, key, high);
     }  
	
//The actual algorithm is being used here.

     public static void binarySearch(int array[], int key, int high) {
         
        int low = 0;
       
           while(high >= low) { //The while loop may continue for as long as the value in the highest index is greater.
              
            int middle = (low + high) / 2;
               
             if(array[middle] == key) {
                System.out.println("Element is found at index: " + middle);
                  break;
             }
              
             if(array[middle] < key) {
                low = middle + 1;
             }
                
             if(array[middle] > key) {
                high = middle - 1;
             }
     }
     }  
}  

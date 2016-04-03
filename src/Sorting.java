import java.util.*;

/*  Class:			Sorting
    Author:			Fabian Flores, Mohammad Usman Sohail
    Class:			CSCI - 230
    Date:			4-2-16
    Description:	This class contains all the sorting algorithms  

    I certify that the code below is my own work.

	Exception(s): N/A

*/

public class Sorting 
{
	// private section
	private ArrayList<RecordedData> allData;
	
	
	// *********  public methods	********
	// *************************************
	
	public void selectionSort(ArrayList<Integer> inputArray)
	{
		
		
	} // end selectionSort
	
	
	
	public void insertionSort(ArrayList<Integer> inputArray)
	{
		
		
		
	} // end insertionSort
	
	
	
	 //-------- support for top-down merge-sort of arrays --------
	  /** Merge contents of arrays S1 and S2 into properly sized array S. */
	  public static <K> void merge(ArrayList<K> S1, ArrayList<K> S2, ArrayList<K> S, Comparator<K> comp) {
	    int i = 0, j = 0;
	    while (i + j < S.size()) {
	      if (j == S2.size() || (i < S1.size() && comp.compare(S1.get(i), S2.get(j)) < 0))
	        S.set(i+j, S1.get(i++)) ;			  // copy ith element of S1 and increment i
	      else
	    	  S.set(i+j, S2.get(j++));                     // copy jth element of S2 and increment j
	    }
	  } // end merge

	  
	  /** Merge-sort contents of array S. */
	  public static <K> void mergeSort(ArrayList<K> S, Comparator<K> comp) 
	  {
	    int n = S.size();
	    if (n < 2) return;                        // array is trivially sorted
	    // divide
	    int mid = n/2;
	    ArrayList<K> S1 = (ArrayList<K>) S.subList(0, mid);   // copy of first half
	    ArrayList<K> S2 = (ArrayList<K>) S.subList(mid, n);   // copy of second half
	    // conquer (with recursion)
	    mergeSort(S1, comp);                      // sort copy of first half
	    mergeSort(S2, comp);                      // sort copy of second half
	    // merge results
	    merge(S1, S2, S, comp);               // merge sorted halves back into original
	    
	  } // end merge sort
	
	  
	  
	  
	  /** Sort the sublist S[a..b] inclusive. */
	  private static <K> void quickSort(ArrayList<K> S, Comparator<K> comp, int a, int b) 
	  {
	    if (a >= b) return;                // subarray is trivially sorted
	    int left = a;
	    int right = b-1;
	    K pivot = S.get(b);
	    K temp;                            // temp object used for swapping
	    while (left <= right) {
	      // scan until reaching value equal or larger than pivot (or right marker)
	      while (left <= right && comp.compare(S.get(left), pivot) < 0) left++;
	      // scan until reaching value equal or smaller than pivot (or left marker)
	      while (left <= right && comp.compare(S.get(right), pivot) > 0) right--;
	      if (left <= right) {             // indices did not strictly cross
	        // so swap values and shrink range
	        temp = S.get(left); 
	        S.set(left, S.get(right)); 
	        S.set(right, temp);
	        
	        left++; right--;
	      }
	    }
	    // put pivot into its final place (currently marked by left index)
	    temp = S.get(left); 
	    S.set(left, S.get(b)); 
	    S.set(b, temp);
	    
	    // make recursive calls
	    quickSort(S, comp, a, left - 1);
	    quickSort(S, comp, left + 1, b);
	    
	  } // end quickSort
	  
	  
	  
	  
}

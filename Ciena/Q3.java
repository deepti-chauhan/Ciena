//asked to do a simple binary search on an array 
// arr[] = {1,3,6,7,9}, K = 7, return index

int BS(int[] arr, int k)
{
  int low = 0;
  int hi = arr.length - 1;
  
  while(low < high)
  {
    int mid = lo+high / 2;
    if(arr[mid] == k) return mid;
    
    if(arr[mid] < k) low = mid;
    else high = mid;
  }
  
  return -1;
}

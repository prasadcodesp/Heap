/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// for max heap
public class Heapsort{


public void sort(int arr[])
{
   int n= arr.length;
   for(int i=n/2-1;i>=0;i--)
 	heapify (arr,n,i);

   for(int i=n-1; i>=0;i--)
   {
      int temp=arr[0];
      arr[0]= arr[i];
      arr[i]=temp;
      heapify(arr,i,0);
   }
}

void heapify(int arr[], int n, int i)
{
    int largest=i;
    int l=2*i+1;
    int r=2*i+2;

  if(l<n && arr[l]>arr[largest])
	largest = l;

  if(r<n && arr[r]>arr[largest])
	largest = r;

  if(largest!=i){
       int swap=arr[i];
	arr[i]= arr[largest];
	arr[largest]=swap;
	heapify(arr,n,largest);
    }
}


/*void heapify(int arr[], int n, int i)
{
    int largest=i;
    int l=2*i+1;
    int r=2*i+2;

  if(l<n && arr[l]<arr[largest])
	largest = l;

  if(r<n && arr[r]<arr[largest])
	largest = r;

  if(largest!=i){
       int swap=arr[i];
	arr[i]= arr[largest];
	arr[largest]=swap;
	heapify(arr,n,largest);
    }
}
*/
public static void main(String[] args)
{
  
  Heapsort h= new Heapsort();
  int[] Arr= new int[]{6,3,4,5,2,7};
  h.sort(Arr);
    System.out.println("Array is:");
    System.out.println("{");
  for(int i=0;i<6;i++)
  System.out.println(+Arr[i]);
     System.out.println("{");
}
}

































class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++)
		{
		    int num = (int)(Math.random()*100);
			arr[i] = num;
		}
		selectionSort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
	public static void selectionSort(int[] arr)
	{
	    for(int i = 0; i < arr.length - 1; i++){
			int min = i;
			for(int j = i + 1; j <arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}

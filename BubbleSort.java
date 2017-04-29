class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++)
		{
		    int num = (int)(Math.random()*100);
			arr[i] = num;
		}
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
	//嵌套for循环且带有哨兵的冒泡排序
	public static void bubbleSort(int[] arr){
		boolean sorted;
		for(int i = 0; i < arr.length - 1; i++){
			sorted = true;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
	}
	//嵌套for循环的冒泡排序
	public static void bubbleSort1(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	//do-whie+for循环且带有哨兵的冒泡排序
	public static void bubbleSort2(int[] arr)
	{
	    boolean flag;
		do{
		    flag = false;
			for(int i = 0; i < arr.length - 1; i++)
			{
			    if(arr[i] > arr[i+1])
				{
				    int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] =tmp;
					flag = true;
				}
			}
		}while(flag);
	}
}

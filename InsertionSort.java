class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++)
		{
		    int num = (int)(Math.random()*100);
			arr[i] = num;
		}
		insertionSort(arr);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + "\t");
		}
	}
	public static void insertionSort(int[] arr)
	{
	    for(int i = 1; i < arr.length; i++)
		{
		    for(int j = i; j > 0; j--)
			{
			    if(arr[j] < arr[j - 1])
				{
				    int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	//��ԭ�漸��һ����ֻ����ѭ������������ʼ�ձ߽粻һ��
	public static void insertionSort1(int[] arr)
	{
	    for(int i = 1; i < arr.length; i++)
		{
		    for(int j = i - 1; j >= 0; j--)
			{
			    if(arr[j + 1] < arr[j])
				{
				    int tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}

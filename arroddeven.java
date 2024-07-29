package javaclass2;

public class arroddeven {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,7,8,9};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
			
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2!=0) {
				System.out.println(arr[j]);
			}
		}

	}

}

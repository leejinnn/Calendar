import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		//월의 최대일수 출력하기
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("반복횟수를 입력하세요:");
	  int r=scanner.nextInt();
	  System.out.println("달을 입력하세요:");
	  for(int i=0;i<r;i++) {
		   int n=scanner.nextInt();
		   int[] maxdays= {31,28,31,30,31,30,31,31,30,31,30,31}; 
		   System.out.println(n+"은"+maxdays[n-1]+"일 까지 있습니다.");
	  }
	 
	   scanner.close();
	  
	}

	
	}



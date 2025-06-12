public class ForTest {

    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            System.out.println(i);
         }
         for (int j=0;j<=100;j=j+5){
             System.out.println(j);
         }
        int k=10;
        while(k>=0){
            System.out.println(k);
            k--;
        }
        int l=10;
        do{
            System.out.println(l);
            l--;
        }while(l>=10);
        for(int i=1;i<=100;i++){
            if(i%2==0){
            System.out.println(i);
        }}
        //ASCII value
        for(int s=1;s<=255;s++)
		{
			System.out.println((char)s);	
		}

        int p= 1;
        int fact=1;
        fact *= p;
        System.out.println(fact);
  }
}
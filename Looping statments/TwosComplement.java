    // Write a program to find 2s complement of a Binary number in java

    import java.util.Scanner;

    public class TwosComplement {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a binary number");
            String binary = sc.next();
            String oneComplement="";
            for(int i=0; i<binary.length();i++){
                char c = binary.charAt(i);
                if(c=='1'){
                oneComplement += '0'; 
                    }
                    else{
                    oneComplement += '1';
                    }
            }
            String twoComplement="";
            for(int j= oneComplement.length()-1; j>=0; j-- ){
                char c = oneComplement.charAt(j);
                if(c=='1'){
                    twoComplement = '1'+ twoComplement;
                }
                else if(c=='0'){
                    twoComplement = '0'+ twoComplement;
                }
                else{
                    twoComplement= c+ twoComplement;
                }
            }
            System.out.println("2's complement of the binary number is: "+twoComplement);
        }
    }

public class SegitigaAngka {
	public static void main(String[] args) {
		int x = 0;
        int c = 9;
        int b = 1;
   
        for(int a= 0;a<=4;a++) {
        	x++;
        	System.out.println("");
            if(x<=0) {
            }
            else {
            	for (int i = b ;i<=c;i++) {
            		if( i%2==0) {
            			System.out.print("_");
                        }else {
                        	System.out.print(i);
                        }
                }
            }
        if( c==5 && b==5 ){
        }
        else {
            c--;
            b++;
            }
        }
	}
}

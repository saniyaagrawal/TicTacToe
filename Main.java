import java.util.*;

class Game{

    Scanner sc=new Scanner(System.in);

    int flag=0;

    int[] ar=new int[9];

               public void run(){

                   while(true){

                              make_grid();

                   int scan_value=scan();

                   boolean status=check();

                   if(status){

                       if(flag==0) flag=2;

                       make_grid();

                       System.out.println("Player "+(flag)+" won");

                       break;

                   }

                   if(scan_value==0){

                       System.out.println("Draw");

                       break;

                   }

                   }

               }

               char a=' ',b=' ',c=' ',d=' ',e=' ',f=' ',g=' ',h=' ',i=' ';

               public void make_grid(){

                   clearScreen();

        System.out.printf("Lets play Tic-Tac-Toe\n\n");

                              System.out.printf("    1   2   3 \n\n");

                              System.out.printf("A   %c | %c | %c \n",a,b,c);

                              System.out.printf("   ---|---|---\n");

                              System.out.printf("B   %c | %c | %c \n",d,e,f);

                              System.out.printf("   ---|---|---\n");

                              System.out.printf("C   %c | %c | %c \n\n",g,h,i);

               }

               public int scan(){

                   int temp=0;

        for(int j=0;j<9;j++){

            if(ar[j]==0)

                temp=1;

        }

        if(temp==0){

            check();

            return 0;

                   }

                   System.out.println("Player "+(flag+1));

                   String str=sc.next();

                   char ch=str.charAt(0);

               char digit=str.charAt(1);

               if(ch=='A' && digit=='1'){

                   if(ar[0]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[0]=1;

                       if(flag==0){

                           a='0';

                           flag=1;

                       }

                       else{

                           a='X';

                           flag=0;

                       }

                   }    

               }

               else if(ch=='A' && digit=='2'){

                   if(ar[1]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[1]=1;

                       if(flag==0){

                           b='0';

                           flag=1;

                       }

                       else{

                           b='X';

                           flag=0;

                       }

                   }    

               }

               else if(ch=='A' && digit=='3'){

                   if(ar[2]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[2]=1;

                       if(flag==0){

                           c='0';

                           flag=1;

                       }

                       else{

                           c='X';

                           flag=0;

                       }

                   }    

               }

               else if(ch=='B' && digit=='1'){

                   if(ar[3]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[3]=1;

                       if(flag==0){

                           d='0';

                           flag=1;

                       }

                       else{

                           d='X';

                           flag=0;

                       }

                   }    

               }

               else if(ch=='B' && digit=='2'){

                   if(ar[4]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[4]=1;

                       if(flag==0){

                           e='0';

                           flag=1;

                       }

                       else{

                           e='X';

                           flag=0;

                       }

                   }    

               }

               else if(ch=='B' && digit=='3'){

                   if(ar[5]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[5]=1;

                       if(flag==0){

                           f='0';

                           flag=1;

                       }

                       else{

                           f='X';

                           flag=0;

                       }

                   }    

               }

               else if(ch=='C' && digit=='1'){

                   if(ar[6]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[6]=1;

                       if(flag==0){

                           g='0';

                           flag=1;

                       }

                       else{

                           g='X';

                           flag=0;

                       }

                   }    

               }

               else if(ch=='C' && digit=='2'){

                   if(ar[7]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[7]=1;

                       if(flag==0){

                           h='0';

                           flag=1;

                       }

                       else{

                           h='X';

                           flag=0;

                       }

                   }    

               }

               else if(ch=='C' && digit=='3'){

                   if(ar[8]==1) {

                       System.out.println("Invalid position");

                       scan();

                   }

                   else{

                       ar[8]=1;

                       if(flag==0){

                           i='0';

                           flag=1;

                       }

                       else{

                           i='X';

                           flag=0;

                       }

                   }    

               }

               return 1;

               }

               public boolean check(){

                   if((a==d && a==g && a!=' ' && d!=' ' && g!=' ') ||

                   (b==e && b==h && b!=' ' && e!=' ' && h!=' ') ||

                   (c==f && c==i && c!=' ' && f!=' ' && i!=' ') ||

                   (a==e && a==i && a!=' ' && e!=' ' && i!=' ') ||

                   (c==e && c==g && c!=' ' && e!=' ' && g!=' ') ||

                   (b==a && b==c && b!=' ' && a!=' ' && c!=' ') ||

                   (d==e && d==f && d!=' ' && e!=' ' && f!=' ') ||

                   (g==h && i==h && g!=' ' && i!=' ' && h!=' '))

                       return true;

                   else

                       return false;

               }

               public static void clearScreen() { 

        System.out.print("\033[H\033[2J"); 

        System.out.flush(); 

    }

}

class Main{

    public static void main(String[] args){

        Game g=new Game();

                   g.run();

               }

} 

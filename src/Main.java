import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr[][]={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
        int testarr[]=new int[9];
        String xo[]={"X","○"};
        for (int i=0;i<3;i++){
            System.out.println();
            System.out.println("------------");
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" | ");
            }
        }
        System.out.println();
        System.out.println("------------");
        int flag=0;
        System.out.print("name of player 1:");
        String p1=input.nextLine();
        System.out.print("name of player 2:");
        String p2=input.nextLine();
        int counter=0;
        int number;
        String turn="";
        String numberS;
        String player="";
        while (flag==0){

                 if((arr[0][0].equals(arr[0][1]) && arr[0][1].equals(arr[0][2]))){
                     System.out.println("finish");
                System.out.println(arr[0][0]+"\t"+player+" wins");
                flag=1;
            }
                   else if ((arr[1][0].equals(arr[1][1]) && arr[1][1].equals(arr[1][2]))){
                       System.out.println("finish");
                System.out.println(arr[1][0]+"\t"+player+" wins");
                flag=1;}
                    else if ((arr[2][0].equals(arr[2][1]) && arr[2][1].equals(arr[2][2]))){
                System.out.println("finish");
                System.out.println(arr[2][0]+"\t"+player+" wins");
                flag=1;
            }
                    else if ((arr[0][0].equals(arr[1][1]) && arr[2][2].equals(arr[1][1]))){
                System.out.println("finish");
                System.out.println(arr[0][0]+"\t"+player+" wins");
                flag=1;
            }
                   else if  ((arr[0][2].equals(arr[1][1]) && arr[2][0].equals(arr[1][1]))){
                System.out.println("finish");
                System.out.println(arr[0][2]+"\t"+player+" wins");
                flag=1;}
            else if ((arr[0][0].equals(arr[1][0]) && arr[2][0].equals(arr[1][0]))){
                System.out.println("finish");
                System.out.println(arr[0][0]+"\t"+player+" wins");
                flag=1;
            }        else if ((arr[0][1].equals(arr[1][1]) && arr[2][1].equals(arr[1][1]))){
                System.out.println("finish");
                System.out.println(arr[0][0]+"\t"+player+" wins");
                flag=1;
            }        else if ((arr[0][2].equals(arr[1][2]) && arr[2][2].equals(arr[1][2]))){
                System.out.println("finish");
                System.out.println(arr[0][1]+"\t"+player+" wins");
                flag=1;
            }
                   else if (counter==9) {
                System.out.println("finish");
                System.out.println("draw");
                flag=1;
            }
                   else{
            if (counter%2==0)
                {System.out.println(p1+"'s   turn");
                turn="X";}
            else
                {System.out.println(p2+"'s   turn");
                turn="○";}
            System.out.print("number of place:");
            number=input.nextInt();
            if(number>=1 && number<=9){
                numberS=String.valueOf(number);
                for (int i = 0; i <3; i++) {
                    for (int j = 0; j <3 ; j++) {
                        if ( arr[i][j].equals(numberS) ){
                                arr[i][j]=turn;
                                counter++;


                        }
                    }
                }
            }
            else
            {
                System.out.println("wrong number");
                continue;
            }

            for (int i=0;i<3;i++){
                System.out.println();
                System.out.println("------------");
                for (int j=0;j<3;j++){
                    System.out.print(arr[i][j]+" | ");
                }
            }
            System.out.println();
            if (turn.equals("X"))
                player=p1;
            else
                player=p2;
            }
        }


    }


}
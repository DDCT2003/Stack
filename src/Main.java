import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las llaves: ");
         String x=  sc.nextLine();

        StringBuilder y = new StringBuilder(x);
        Boolean c=false;
        int indice=0;
        Stack<String> miStack = new Stack<>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{'|| x.charAt(i)=='(' ||x.charAt(i)=='[')
            {
                miStack.push(String.valueOf(x.charAt(i)));
            }
            else{
                indice=i;
                break;
            }
        }
        int aux1= miStack.size();
        int aux2;
        int el=indice;
        int il=0;
        for(int i=0; i<aux1;i++){

   try{
            String aux= miStack.pop();





            if (aux.equals("(")) {

            for(int e=0; e<aux1;e++) {

                    if (x.charAt(e+el+il) == ')') {
                        c = true;
                        y.setCharAt(indice, ')');
                        break;
                  }

                }
            }

            if (aux.equals("{")){

        for(int e=0; e<aux1;e++) {

                if(x.charAt(e+el+il)=='}'){
                    c=true;
                    y.setCharAt(indice, '}');
                    break;
               }

                }
            }
            if (aux.equals("[")){

                for(int e=0; e<aux1;e++) {

                if(x.charAt(e+el+il)==']'){
                    c=true;
                    y.setCharAt(indice, ']');
                    break;
               }

                }
            }
            if(c==false){
                break;
            }
            if(x.length()>aux1*2){
                c=false;
                break;
            }
   }
       catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("No coinciden las llaves");
            c=false;
            break;
        }
indice +=1;
   il++;
        }
        if (c==true) {
            System.out.println("Todas las llaves coinciden");

            System.out.println(y.toString());
        } else if(c==false){

                System.out.println("No coinciden las llaves");



        }


    }
}
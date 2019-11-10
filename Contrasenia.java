import java.util.*;
public class Contrasenia
{
    public static void main(String args[]){
        String contrasenia1="atai";
        String contrasenia2="";
        Scanner sc=new Scanner(System.in);
      
        for(int i=0; i<3; i++){
            
        System.out.println("Introduce la contraseña");
        contrasenia2=sc.next();
        if(contrasenia1.equals(contrasenia2))
        {
            System.out.println("Contraseña valida");
            break;
        }
        else{
        System.out.println("Incorrecta");} 
    }}
}

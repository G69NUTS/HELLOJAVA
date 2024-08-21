import java.util.Scanner;
class Hello {

public static  void main (String[] args) {


Scanner leer = new Scanner(System.in);

System.out.println("Hello desde block notas"); 
String name;
System.out.println("type your name: ");
name = leer.next();
System.out.println(name);
System.out.println("type a number");
int number = leer.nextInt();
System.out.println("type another number");
int number2 = leer.nextInt();
System.out.println(number+number2);
System.out.println(number-number2);
System.out.println(number*number2);
	}
} 

package Sess4Assignment4;

import java.util.Scanner;
public class TestDemo {
	public static void main(String[]args){
		System.out.println(Integer.parseInt (args[0]));//we are passing the arguments to check weather we have entered zero or not
		

		     int n1=Integer.parseInt(args[0]);                            //Initializing the value variable n as zero
		                
						if ( n1 == 0) {            //using if loop checking that if it is equal to zero it shows that we have entered zero 
		                        System.out.println("You have entered ZERO ");
		                        String char1 = null;                           //taking the ASCII value has null it prints as null
		                        System.out.println("ASCII value of n is" + (char1));
		                } else if (n1 < 0) {                                         //if we pass the arguments negative in output it showing has negative value
		                        System.out.println("You have entered Negetive value ");
		                } else {
		                        System.out.println("You have entered positive value ");
		                }
		                Scanner in = new Scanner(System.in);//we are using scanner to initialize the values of physics ,chemistry ,mathematicsn in the output 

		                System.out.print("Enter the marks of Physics ");// if we give the marks of 3 subjects it prints
		                int num1 = in.nextInt();

		                System.out.print("Enter the marks of Chemistry ");
		                int num2 = in.nextInt();

		                System.out.print("Enter the marks of Mathematics");
		                int num3 = in.nextInt();

		                int physics = num1, chemistry = num2, mathematics = num3,average;//after initializing the marks it calculates the average value
		                average = (physics + chemistry + mathematics) / 3;
		                if (average >= 70) {                     //if average marks are less than or equals to 70 it shows the grade A has output
		                        System.out.println("Grade A");
		                }

		                        if ((average >= 61) && (average < 70)) {
		                                System.out.println("Grade B");//if average marks are less 70  or greater than equals to 61 it shows the grade B has output
		                        }
		                                if (average < 61) {
		                                        System.out.println("Grade C");//if average marks are less 61 it shows the grade C has output
		                                }

		                                }


		                
	}



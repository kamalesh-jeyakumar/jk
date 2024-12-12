import java.util.Scanner;
class copycons
{
	String name;
	int age;

	copycons(String name,int age)
	{
	this.name = name;
	this.age  = age;
	}

	copycons(copycons cscs)
	{
	System.out.println("Copy Contructor");
	this.name = cscs.name;
	this.age = cscs.age;
	}

	public void display()
      {
        System.out.println("Name :"+name);
        System.out.println("age :"+ age);
    }
	
	public static void main(String args[])
	{
	Scanner bsc = new Scanner(System.in);
	System.out.print("Enter your name: ");
	String name = bsc.nextLine();
	System.out.print("Enter your age: ");
	int age = bsc.nextInt();
	
	copycons student1 = new copycons(name,age);
        copycons student2 = new copycons(student1);
        System.out.println("\nDetails of Student 100");
        student1.display();

        System.out.println("\nDetails of Student 2");
        student2.display(); 
        
	}
	}

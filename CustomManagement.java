package package1;
import package2.*;
import exception.InvalidPasswordException;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

interface products{
	String display();
	double afterTax();
}

class Electronic_Products extends Port implements products{

	int max=21060;
	int min=11145;

	public String name;
	private int code=(int) (min+Math.random()*(max-min+1));
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Electronic_Products(){}

	Electronic_Products(String name,double price,String location){
		super(location);
		this.name=name;
		this.price=price;
	}

	public String display() {
		return "You selected Electronic Products...";
	}

	public double afterTax(){
		return price+price*0.15;
	}

	@Override
	public String toString(){
		return display()+"\n"+"Product Name: "+name+"\nProduct's Code: "+code+"\nProduct's Price: "+price+"Tk\nWith Tax"+afterTax()+"Tk";
	}
}
class Clothing_Products extends Port implements products{

	int max=21060;
	int min=11145;

	public String name;
	private int code=(int) (min+Math.random()*(max-min+1));
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Clothing_Products(){}

	Clothing_Products(String name,double price,String location){
		super(location);
		this.name=name;
		this.price=price;
	}

	public String display() {
		return "You selected Clothing Products...";
	}

	public double afterTax(){
		return price+price*0.3;
	}

	@Override
	public String toString(){
		return display()+"\n"+"Product Name: "+name+"\nProduct's Code: "+code+"\nProduct's Price: "+price+"Tk\nWith Tax"+afterTax()+"Tk";
	}
}

class Food_Products extends Port implements products{

	int max=21060;
	int min=11145;

	public String name;
	private int code=(int) (min+Math.random()*(max-min+1));
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Food_Products(){}

	Food_Products(String name,double price,String location){
		super(location);
		this.name=name;
		this.price=price;
	}

	public String display() {
		return "You selected Food Products...";
	}

	public double afterTax(){
		return price+price*0.1;
	}

	@Override
	public String toString(){
		return display()+"\n"+"Product Name: "+name+"\nProduct's Code: "+code+"\nProduct's Price: "+price+"Tk\nWith Tax"+afterTax()+"Tk";
	}}

class Medicine_Products extends Port implements products{

	int max=21060;
	int min=11145;

	public String name;
	private int code=(int) (min+Math.random()*(max-min+1));
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Medicine_Products(){}

	Medicine_Products(String name,double price,String location){
		super(location);
		this.name=name;
		this.price=price;
	}

	public String display() {
		return "You selected Medicine Products...";
	}

	public double afterTax(){
		return price+price*0.15;
	}

	@Override
	public String toString(){
		return display()+"\n"+"Product Name: "+name+"\nProduct's Code: "+code+"\nProduct's Price: "+price+"Tk\nWith Tax"+afterTax()+"Tk";
	}
}

class Book_Products extends Port implements products{

	int max=21060;
	int min=11145;

	public String name;
	private int code=(int) (min+Math.random()*(max-min+1));
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Book_Products(){}

	Book_Products(String name,double price,String location){
		this.name=name;
		this.price=price;
	}

	public String display() {
		return "You selected Clothing Products...";
	}

	public double afterTax(){
		return price+price*0.2;
	}

	@Override
	public String toString(){
		return display()+"\n"+"Product Name: "+name+"\nProduct's Code: "+code+"\nProduct's Price: "+price+"Tk\nWith Tax"+afterTax()+"Tk";
	}
}

class Automobile_Products extends Port implements products{

	int max=21060;
	int min=11145;

	public String name;
	private int code=(int) (min+Math.random()*(max-min+1));
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Automobile_Products(){}

	Automobile_Products(String name,double price,String location){
		this.name=name;
		this.price=price;
	}

	public String display() {
		return "You selected Clothing Products...";
	}

	public double afterTax(){
		return price+price*0.5;
	}

	@Override
	public String toString(){
		return display()+"\n"+"Product Name: "+name+"\nProduct's Code: "+code+"\nProduct's Price: "+price+"Tk\nWith Tax"+afterTax()+"Tk";
	}
}

class Toys_Products extends Port implements products{

	int max=21060;
	int min=11145;

	public String name;
	private int code=(int) (min+Math.random()*(max-min+1));
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	Toys_Products(){}

	Toys_Products(String name,double price,String location){
		super(location);
		this.name=name;
		this.price=price;
	}

	public String display() {
		return "You selected Clothing Products...";
	}

	public double afterTax(){
		return price+price*0.35;
	}

	@Override
	public String toString(){
		return display()+"\n"+"Product Name: "+name+"\nProduct's Code: "+code+"\nProduct's Price: "+price+"Tk\nWith Tax"+afterTax()+"Tk";
	}
}
public class CustomManagement {
	static void check(String password) throws InvalidPasswordException{
		final int PASSWORD_LENGTH=8;
		final int NUMBER_OF_UPPER_CASE=1;
		final int NUMBER_OF_LOWER_CASE=2;
		final int NUMBER_OF_DIGIT=2;

		int upperCaseCount=0;
		int lowerCaseCount=0;
		int digitCount=0;

		for(int i=0;i<password.length();i++) {
			char ch=password.charAt(i);

			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
			else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
			else if(Character.isDigit(ch)) {
				digitCount++;
			}
		}
		if(password.length()>=PASSWORD_LENGTH && upperCaseCount>=NUMBER_OF_UPPER_CASE && lowerCaseCount>=NUMBER_OF_LOWER_CASE && digitCount>=NUMBER_OF_DIGIT) {
			System.out.println("Signed up successfully !!!\n\n");
			System.out.println("1.Imported Products");
			System.out.println("2.Export Products");
			System.out.println("\nChoose(1/2): ");
			
			Scanner sc=new Scanner(System.in);
			int choice;

			choice=sc.nextInt();

			switch(choice) {
			case 1:System.out.println("You have selected Imported Products");
			int item;
			System.out.println("1.Electronic Items");
			System.out.println("2.Clothing Items");
			System.out.println("3.Food Items");
			System.out.println("4.Medicine Items");
			System.out.println("5.Book Items");
			System.out.println("6.Automobile Items");
			System.out.println("7.Toys Items");
			item=sc.nextInt();
			switch(item) {
			case 1:System.out.println("You have selected Electronic items");
			System.out.println("\nHere is a sample-");
			Electronic_Products eob1,eob2;
			eob1=new Electronic_Products("Macbook Air M1",140000,"USA");
			System.out.println(eob1);
			System.out.println("\n\nEnter product name ,price and location with a space inbetween");
			eob2=new Electronic_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File.txt",true));
				writer.write(eob2.getName()+" "+eob2.getPrice()+" "+eob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(eob2);
			break;
			case 2:System.out.println("You have selected Clothing products");
			System.out.println("\nHere is a sample-");
			Clothing_Products cob1,cob2;
			cob1=new Clothing_Products("Denim Shirt",12000,"USA");
			System.out.println(cob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			cob2=new Clothing_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File.txt",true));
				writer.write(cob2.getName()+" "+cob2.getPrice()+" "+cob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(cob2);
			break;
			case 3:System.out.println("You have selected Food products");
			System.out.println("\nHere is a sample-");
			Food_Products fob1,fob2;
			fob1=new Food_Products("Snacks",3000,"USA");
			System.out.println(fob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			fob2=new Food_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File.txt",true));
				writer.write(fob2.getName()+" "+fob2.getPrice()+" "+fob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(fob2);
			break;
			case 4:System.out.println("You have selected Medicine Products");
			System.out.println("\nHere is a sample-");
			Medicine_Products mob1,mob2;
			mob1=new Medicine_Products("Medicin",4000,"USA");
			System.out.println(mob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			mob2=new Medicine_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File.txt",true));
				writer.write(mob2.getName()+" "+mob2.getPrice()+" "+mob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(mob2);
			break;
			case 5:System.out.println("You have selected Book items");
			System.out.println("\nHere is a sample-");
			Book_Products bob1,bob2;
			bob1=new Book_Products("Harry Potter",1500,"USA");
			System.out.println(bob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			bob2=new Book_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File.txt",true));
				writer.write(bob2.getName()+" "+bob2.getPrice()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(bob2);
			break;
			case 6:System.out.println("You have selected Automobile");
			System.out.println("\nHere is a sample-");
			Automobile_Products aob1,aob2;
			aob1=new Automobile_Products("Toyota",14000000,"USA");
			System.out.println(aob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			aob2=new Automobile_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File.txt",true));
				writer.write(aob2.getName()+" "+aob2.getPrice()+" "+aob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(aob2);
			break;
			case 7:System.out.println("You have selected Toys");
			System.out.println("\nHere is a sample-");
			Toys_Products tob1,tob2;
			tob1=new Toys_Products("Lego",1300,"USA");
			System.out.println(tob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			tob2=new Toys_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File.txt",true));
				writer.write(tob2.getName()+" "+tob2.getPrice()+" "+tob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(tob2);
			break;
			default:
				System.out.println("Invalid choice");
			}
			break;
			case 2:System.out.println("You have selected Exported Products");
			int item1;
			System.out.println("1.Electronic Items");
			System.out.println("2.Clothing Items");
			System.out.println("3.Food Items");
			System.out.println("4.Medicine Items");
			System.out.println("5.Book Items");
			System.out.println("6.Automobile Items");
			System.out.println("7.Toys Items");
			item1=sc.nextInt();
			switch(item1) {
			case 1:System.out.println("You have selected Electronic items");
			System.out.println("\nHere is a sample-");
			Electronic_Products eob1,eob2;
			eob1=new Electronic_Products("Macbook Air M1",140000,"USA");
			System.out.println(eob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			eob2=new Electronic_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File_Export.txt",true));
				writer.write(eob2.getName()+" "+eob2.getPrice()+" "+eob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(eob2);
			break;
			case 2:System.out.println("You have selected Clothing products");
			System.out.println("\nHere is a sample-");
			Clothing_Products cob1,cob2;
			cob1=new Clothing_Products("Denim Shirt",12000,"USA");
			System.out.println(cob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			cob2=new Clothing_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File_Export.txt",true));
				writer.write(cob2.getName()+" "+cob2.getPrice()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(cob2);
			break;
			case 3:System.out.println("You have selected Food products");
			System.out.println("\nHere is a sample-");
			Food_Products fob1,fob2;
			fob1=new Food_Products("Snacks",3000,"USA");
			System.out.println(fob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			fob2=new Food_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File_Export.txt",true));
				writer.write(fob2.getName()+" "+fob2.getPrice()+" "+fob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(fob2);
			break;
			case 4:System.out.println("You have selected Medicine Products");
			System.out.println("\nHere is a sample-");
			Medicine_Products mob1,mob2;
			mob1=new Medicine_Products("Medicin",4000,"USA");
			System.out.println(mob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			mob2=new Medicine_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File_Export.txt",true));
				writer.write(mob2.getName()+" "+mob2.getPrice()+" "+mob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(mob2);
			break;
			case 5:System.out.println("You have selected Book items");
			System.out.println("\nHere is a sample-");
			Book_Products bob1,bob2;
			bob1=new Book_Products("Harry Potter",1500,"USA");
			System.out.println(bob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			bob2=new Book_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File_Export.txt",true));
				writer.write(bob2.getName()+" "+bob2.getPrice()+" "+bob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(bob2);
			break;
			case 6:System.out.println("You have selected Automobile");
			System.out.println("\nHere is a sample-");
			Automobile_Products aob1,aob2;
			aob1=new Automobile_Products("Toyota",14000000,"USA");
			System.out.println(aob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			aob2=new Automobile_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File_Export.txt",true));
				writer.write(aob2.getName()+" "+aob2.getPrice()+" "+aob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(aob2);
			break;
			case 7:System.out.println("You have selected Toys");
			System.out.println("\nHere is a sample-");
			Toys_Products tob1,tob2;
			tob1=new Toys_Products("Lego",1300,"USA");
			System.out.println(tob1);
			System.out.println("\\n\\nEnter product name ,price and location with a space inbetween");
			tob2=new Toys_Products(sc.next(),sc.nextInt(),sc.next());
			try {
				BufferedWriter writer=new BufferedWriter(new FileWriter("Project_File_Export.txt",true));
				writer.write(tob2.getName()+" "+tob2.getPrice()+" "+tob2.getLocation()+"\n");
				writer.close();
			} catch (IOException e) {
				System.out.println("I/O Exception");
			}
			System.out.println(tob2);
			break;
			default:
				System.out.println("Invalid choice");
			}
			break;
			default:
				System.out.println("Invalid Choice");
			}
		}
		else {
			System.out.println("Invalid Password\n1.Set password with more than 7 charecters\n2.At least keep one(1) upper case\n3.At least keep two(2) lower case\n4.At least keep two(2) digit\n\n");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t------------------------------");
		System.out.println("\t\tWelcome to Custom Management");
		System.out.println("\t\t------------------------------\n");

		System.out.println("1. User Portal");
		System.out.println("2. Employee List");
		int Choose = 0;
		System.out.println("Choose(1/2): ");
		Choose=sc.nextInt();

		if(Choose == 1) {
			System.out.println("Enter name and password: ");
			UserSignUp ob1=new UserSignUp(sc.next(),sc.next());
			try {
				check(ob1.password);
			}catch(InvalidPasswordException e) {
				System.out.println("Invalid password exception caught "+e);
			}
		}
		
		else if(Choose == 2) {
			System.out.println("Welcome to Employee List");

			String space=" ";
			try {
				BufferedReader reader=new BufferedReader(new FileReader("Customs_Employee.csv"));

				while((space= reader.readLine()) != null) {
					String [] store=space.split(",");
					System.out.println("Officer's Name: "+store[0]+" Officer's Designation: "+store[1]+" Phone Number: "+store[2]+" Email: "+store[3]);
				}
				reader.close();
			} catch (FileNotFoundException e) {
				System.out.println("File no found" +e);
			} catch (IOException e) {
				System.out.println("I/O Exception" +e);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("\n");
			}
		}
		else {
			System.out.println("Invalid Choice");
		}
	}
}

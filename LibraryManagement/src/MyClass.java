import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			Library lib=new Library();
			int i,choice;
			for(i=0;i<50;i++){
			    System.out.println("1.Add Book");
			    System.out.println("2.Display all book details");
			    System.out.println("3.Count number of books - by book name");
			    System.out.println("4.Exit");
			    System.out.println("Enter your choice:");
			    choice=s.nextInt();s.nextLine();
			    if(choice==1){
			        Book b=new Book();
			        System.out.println("Enter the book name:");
			        b.setBookName(s.nextLine());
			        lib.addBook(b);
			    }
			    if(choice==2){
			        ArrayList<Book> result=lib.viewAllBooks();
			        if(result.isEmpty())
			        {
			            System.out.println("The list is empty");
			            continue;
			        }
			        Iterator iter=result.iterator();
			        while(iter.hasNext())
			        {
			            Book b=(Book)iter.next();
			            System.out.println("Book name:"+b.getBookName());
			        }
			    }
			    
			    if(choice==3){
			        System.out.println("Enter the book name");
			        String name=s.nextLine();
			        System.out.println("Count is "+lib.countnoofbook(name));
			    }
			    if(choice==4)
			    System.exit(0);
			}
		}
	}

}

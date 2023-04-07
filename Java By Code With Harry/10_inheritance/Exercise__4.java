import java.util.Scanner;

class book{
    protected int bId;
    protected String bName;
    protected String auName;
    protected int price;
    protected boolean status = true;

    book(int bId, String bName, String auName, int price){
        this.bId = bId;
        this.bName = bName;
        this.auName = auName;
        this.price = price;
    }

    public String toString()
    {
        return "\n\n\tBook Id : "+this.bId+"\n\tBook Name : "+this.bName+"\n\tAuthor Name : "+this.auName+"\n\tPrice : "+this.price+"\n\tAvailable : " +(this.status?"yes":"no");
    }
    
}

class books{
    
    protected book bs[];
    int noOfBooks = -1;

    books()
    {
        bs = new book[300];
    }

    public void addBook()
    {
        int bId;
        String bName;
        String auName;
        int price;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter bId : ");
        bId = sc.nextInt();

        sc.nextLine();

        System.out.println("\nEnter bName : ");
        bName = sc.nextLine();

        sc.nextLine();

        System.out.println("\nEnter auName : ");
        auName = sc.nextLine();

        sc.nextLine();

        System.out.println("\nEnter price : ");
        price = sc.nextInt();

        System.out.println("\n\n");

        noOfBooks++;

        bs[noOfBooks] = new book(bId, bName, auName, price);
        System.out.println(bs[noOfBooks]);
    }

    public void showAvaliableBooks()
    {
        System.out.println("\nTotal : "+(noOfBooks+1));
        if(noOfBooks==-1)
            System.out.println("\n\n\t#Empty");
        
        for(int i = 0; i<=noOfBooks; i++)
        {
            System.out.println(bs[i]);
        }
    }
}

class library extends books{

    protected int option;
    Scanner sc;

    library(){
        sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n\n-------Welcome To Library Management System------");
            System.out.println("\n 1.Show books ");
            System.out.println("\n 2.Add New Book ");
            System.out.println("\n 3.Issue Book ");
            System.out.println("\n 4.Return Book ");
            System.out.println("\n 5.Exit ");
            System.out.println("\n\nSelect Option ::: ");
            option = sc.nextInt();

            switch(option)
            {
                case 1->{
                    System.out.println("------Available Books-----");
                    showAvaliableBooks();
                }
                case 2 -> {
                    System.out.println("-------Add new book-------\n");
                    addBook();
                }
                
                case 3 -> {
                    System.out.println("-------Issue Book-------");
                    issueBook();
                }

                case 4 -> {
                    System.out.println("-------Return Book-------");
                    returnBooks();
                }

                case 5 -> {
                    System.out.println("exit....");
                    System.exit(0);
                }

                default -> {
                    System.out.println("Invalid Option");
                }
                
            }
        }
    }

    public void issueBook()
    {
        String BookName;
        System.out.println("\n\n");
        System.out.println("Enter book name : ");
        sc.nextLine();
        BookName = sc.nextLine();
       
        int search = bookSearch(BookName);
        if(search!=-1)
        {
            if(bs[search].status)
            {
                bs[search].status = false;
                System.out.println("Book Issued Successfully......"); 
            }
            else{
                System.out.println("Book is not available.....");
            }
           
        }
        else{
            System.out.println("Entered Name is invalid please enter valid name.........");
        }
    }

    public int bookSearch(String bname)
    {
        for(int i = 0; i<=noOfBooks; i++)
        {
            if(bs[i].bName.equalsIgnoreCase(bname))
            {
                return i;
            }
        }
        return -1;
    }

    public void returnBooks()
    {
        String BookName;
        System.out.println("\n\n");
        System.out.println("Enter book name : ");
        sc.nextLine();
        BookName = sc.nextLine();
       
        int search = bookSearch(BookName);
        if(search!=-1)
        {
            if(bs[search].status==false)
            {
                bs[search].status = true;
                System.out.println("Book Retrun Successfully......"); 
            }
            else{
                System.out.println("Book is already available.....");
            }
           
        }
        else{
            System.out.println("Entered Name is invalid please enter valid name.........");
        }
    }
}


public class Exercise__4 {
    public static void main(String args[])
    {
        // requriements : 

        /*
            you have implement a library using java class library
            
            method: addBooks, issueBook, returnBook, showAvaliableBooks
            
            Properties: array to store the avaliable book

            array to store the issued books
            
         */

         library lib = new library();


    }    
}
public class Bookstore {
    public static void main(String[]args){

        Book book1=new Book("Społeczeństwo zerowych kosztów krańcowych", "Jeremy Rifkin", "Studio EMKA", 2016);

        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.publisher);
        System.out.println(book1.year);

        Book book2=new Book("Java. Podstawy", "Cay S. Horstmann", "Helion",2016);


        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.publisher);
        System.out.println(book2.year);




    }
}

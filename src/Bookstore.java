public class Bookstore {
    public static void main(String[]args){

        Book book1=new Book("Społeczeństwo zerowych kosztów krańcowych", "Jeremy Rifkin", "Studio EMKA", 2016);
        book1.Title="Społeczeństwo zerowych kosztów krańcowych";
        book1.Author="Jeremy Rifkin";
        book1.Publisher="Studio EMKA";
        book1.Year=2016;

        System.out.println(book1.Title);
        System.out.println(book1.Author);
        System.out.println(book1.Publisher);
        System.out.println(book1.Year);

        Book book2=new Book("Java. Podstawy", "Cay S. Horstmann", "Helion",2016);
        book2.Title="Java.Podstawy";
        book2.Author="Cay S. Horstmann";
        book2.Publisher="Helion";
        book2.Year=2016;

        System.out.println(book2.Title);
        System.out.println(book2.Author);
        System.out.println(book2.Publisher);
        System.out.println(book2.Year);




    }
}

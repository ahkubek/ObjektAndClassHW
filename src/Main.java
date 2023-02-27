
        public class Main {
            public static void main(String[] args) {
                Author ASPushkin = new Author("Александр", "Пушкин");
                Author esenin = new Author("Константин", "Есенин");
                Author esenin2 = new Author("Константин", "Есенин");
                Book captains_daughter = new Book("Капитанская дочь", 1836, ASPushkin);
                Book poem = new Book("Черный человек ", 1993, esenin);
//print(captains_daughter);
//print(poem);
                Book book = new Book("Черный человек", 1993, esenin);
                Author autor = new Author("Константин", "Есенин");
                System.out.println(book);
                System.out.println(captains_daughter);
                System.out.println(esenin.equals(esenin2));


            }

/*    private static void print(Book book) {
        System.out.println(
        "Название книги"+book.getTitle()+"год издания "+ book.getPublisheryear()+"Автор "+book.getAuthor().getSurname());
    }*/


        }
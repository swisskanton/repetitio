//Create a BlogPost class that has
//  an authorName
//  a title
//  a text
//  a publicationDate (string)
//Create a few blog post objects:
//  "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//  Lorem ipsum dolor sit amet.
//
//  "Wait but why" titled by Tim Urban posted at "2010.10.10."
//  A popular long-form, stick-figure-illustrated blog about almost everything.
//
//  "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//  Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
//  When I asked to take his picture outside one of IBM’s New York City offices, he told me that
//  he wasn’t really into the whole organizer profile thing.

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {
        this("", "", "", "");
    }

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public static void main(String[] args) {
        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");

        BlogPost post2;
        post2 = new BlogPost();
        post2.authorName = "Tim Urban";
        post2.title = "Wait but why";
        post2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        post2.publicationDate = "2010.10.10.";

        String author = "William Turton";
        String title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        String text = """
                Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
                When I asked to take his picture outside one of IBM’s New York City offices, he told me that
                he wasn’t really into the whole organizer profile thing.""";
        String date = "2017.03.28.";
        BlogPost post3 = new BlogPost(author, title, text, date);
    }
}

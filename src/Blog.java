import java.util.ArrayList;

/*
    Reuse your BlogPost class
    Create a Blog class which can:
        store a list of BlogPosts
        and has the following methods:
            add(BlogPost) -> adds a BlogPost to the list
            delete(int) -> deletes the BlogPost from the given index
            update(int, BlogPost) -> replaces an item at the given index with a new BlogPost
 */
public class Blog {
    public ArrayList<BlogPost> listOfBlogPosts = new ArrayList<>();

    public void add(BlogPost blogPost) {
        this.listOfBlogPosts.add(blogPost);
    }

    public void delete(int index) {
        try {
            this.listOfBlogPosts.remove(index);
        } catch (Exception e) {
            System.out.println("There is no item with given index.");
        }
    }

    public void update(int index, BlogPost blogPost) {
        try {
            this.listOfBlogPosts.set(index, blogPost);
        } catch (Exception e) {
            System.out.println("There is no item with given index.");
        }
    }

    public static void main(String[] args) {
        Blog blog = new Blog();
        BlogPost post1 = new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        blog.add(post1);
        System.out.println(blog.listOfBlogPosts.get(0).text);

        BlogPost post2;
        post2 = new BlogPost();
        post2.authorName = "Tim Urban";
        post2.title = "Wait but why";
        post2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        post2.publicationDate = "2010.10.10.";
        blog.add(post2);

        blog.delete(2);

        String author = "William Turton";
        String title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        String text = """
                Daniel Hanley, a cybersecurity engineer at IBM, doesn't want to be the center of attention.
                When I asked to take his picture outside one of IBM's New York City offices, he told me that
                he wasn't really into the whole organizer profile thing.""";
        String date = "2017.03.28.";
        BlogPost post3 = new BlogPost(author, title, text, date);

        blog.update(1, post3);
        System.out.println(blog.listOfBlogPosts.get(1).text);
    }
}

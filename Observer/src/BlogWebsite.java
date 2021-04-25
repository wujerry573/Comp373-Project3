public class BlogWebsite {
    public static void main(String[] args) {

        Page BlogPage = new Page("Cooking Recipes");
        Post BlogPost = new Post("How to make Cookies");

        Follower f1 = new Follower("George");
        Follower f2 = new Follower("Janet");

        BlogPage.follow(f1);
        BlogPage.follow(f2);
        BlogPage.addPost(BlogPost);
    }
}
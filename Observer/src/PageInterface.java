import java.lang.reflect.Array;
import java.util.ArrayList;

public interface PageInterface {
    //    setters and getters
    public void setPageName(String name);
    public String getPageName();
    public ArrayList<Post> getPosts();
    public ArrayList<FollowerInterface> getFollowers();

    //    method to add / remove follower to page
    public void follow(FollowerInterface f);
    public void unfollow(FollowerInterface f);

    //    notify method for Observer pattern
    public void notifyFollowers();

    //    method to add / remove post to page
    public void addPost(Post p);
    public void removePost(Post p);
}

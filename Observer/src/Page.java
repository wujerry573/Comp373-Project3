import java.util.ArrayList;

public class Page implements PageInterface{
    private String pageName;
    private ArrayList<Post> posts;
    private ArrayList<Follower> followers;


    @Override
    public void setPageName(String name) {

    }

    @Override
    public String getPageName() {
        return null;
    }

    @Override
    public ArrayList<Post> getPosts() {
        return null;
    }

    @Override
    public ArrayList<FollowerInterface> getFollowers() {
        return null;
    }

    @Override
    public void follow(FollowerInterface f) {

    }

    @Override
    public void unfollow(FollowerInterface f) {

    }

    @Override
    public void notifyFollowers() {
        //TODO notify method for observer class
        //this method calls update for each follower
    }

    @Override
    public void addPost(Post p) {
        //TODO add post and notify followers when new post is added

    }

    @Override
    public void removePost(Post p) {

    }
}

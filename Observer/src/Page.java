import java.util.ArrayList;

public class Page implements PageInterface{
    private String pageName;
    private ArrayList<Post> posts;
    private ArrayList<Follower> followers;


    @Override
    public void setPageName(String name) {
        name = pageName;
    }

    @Override
    public String getPageName() {
        return pageName;
    }

    @Override
    public ArrayList<Post> getPosts() {
        return return posts;
    }

    @Override
    public ArrayList<FollowerInterface> getFollowers() {
        return followers;
    }

    @Override
    public void follow(FollowerInterface f) {
        followers.add(f);
    }

    @Override
    public void unfollow(FollowerInterface f) {
        followers.remove(f);
    }

    @Override
    public void notifyFollowers() {
        for(Follower follower : followers) {
            follower.update("New Post Added!");
        }
        //this method calls update for each follower
    }

    @Override
    public void addPost(Post p) {
        posts.add(p);
        notifyFollowers();
    }

    @Override
    public void removePost(Post p) {
        posts.remove(p);
    }
}

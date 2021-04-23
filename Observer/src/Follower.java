import java.lang.reflect.Array;
import java.util.ArrayList;

public class Follower implements FollowerInterface{
    private String name;
    private ArrayList<PageInterface> followedPages;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<PageInterface> getFollowedPages() {
        return followedPages;
    }

    @Override
    public void addPage(PageInterface p) {
        followedPages.add(p);
    }

    @Override
    public void removePage(PageInterface p) {
        followedPages.remove(p);
    }

    @Override
    public void update(String message) {
        System.out.println(message);
        //Can print out information about new posts to subscribed page
    }
}

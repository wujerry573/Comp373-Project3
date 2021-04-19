import java.lang.reflect.Array;
import java.util.ArrayList;

public class Follower implements FollowerInterface{
    private String name;
    private ArrayList<Page> followedPages;

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ArrayList<PageInterface> getFollowedPages() {
        return null;
    }

    @Override
    public void addPage(PageInterface p) {

    }

    @Override
    public void removePage(PageInterface p) {

    }

    @Override
    public void update(String message) {
        //TODO implement update method for observer pattern
        //Can print out information about new posts to subscribed page
    }
}

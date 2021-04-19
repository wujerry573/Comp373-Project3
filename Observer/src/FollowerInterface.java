import java.util.ArrayList;

public interface FollowerInterface {
    //    setters and getters
    public void setName(String name);
    public String getName();
    public ArrayList<PageInterface> getFollowedPages();

    //    methods to add / remove followed pages
    public void addPage(PageInterface p);
    public void removePage(PageInterface p);

    //    update method for observer pattern
    public void update(String message);
}

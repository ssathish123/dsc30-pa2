import java.util.ArrayList;
import utilities.FullStackException;



/*
 * NAME: Sanjit Sathish
 * PID: A17804789
 */

/**
 *
 *
 * @author Sanjit
 * @since 2024
 */
public class WebBrowser {

    private String currentPage;
    private ArrayList<String> history;
    private MyStack prev;
    private MyStack next;

    private static final String DEFAULT_PAGE = "google.com";

    /**
     * No Params
     */

    public WebBrowser() {
        currentPage = DEFAULT_PAGE;
        history = new ArrayList<String>();
        prev = new MyStack(10);
        next = new MyStack(10);
    }

    /**
     * No Params
     */
    public String getCurrentPage() {
        // TODO: complete implementation
        return currentPage;
    }

    /**
     * Newlink tells you a newLink
     */
    public void openNewPage(String newLink) {
        prev.push(currentPage);
        currentPage = newLink;
        next.clear();
        history.add(currentPage);
    }

    /**
     * No Params
     */
    public void previousPage() {
        next.push(currentPage);
        currentPage = prev.pop();
        history.add(currentPage);
    }

    /**
     * No Params
     */
    public void nextPage() {
        prev.push(currentPage);
        currentPage = next.pop();
        history.add(currentPage);
    }

    /**
     * No Params
     */
    public void newTab() {
        currentPage = DEFAULT_PAGE;
        prev.clear();
        next.clear();
    }

    /**
     * No Params
     */
    public ArrayList getHistory() {
        return history;
    }

    /**
     * No Params
     */
    public void clearHistory() {
        history = new ArrayList<String>();
    }

    /**
     * Link is the link you want to check
     */
    public boolean findLink(String link) {
        // TODO: complete implementation
        if (history.contains(link)){
            prev.push(currentPage);
            currentPage = link;
            history.add(link);
            return true;
        } else {
            return false;
        }
    }

}

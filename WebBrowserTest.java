import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WebBrowserTest {

    @Test
    public void example_1(){
        WebBrowser test = new WebBrowser();
        assertEquals("google.com", test.getCurrentPage());
    }

    @Test
    public void example_2(){
        WebBrowser test = new WebBrowser();
        test.openNewPage("youtube.com");
        assertEquals("youtube.com", test.getCurrentPage());
        test.openNewPage("fun.com");
        assertEquals("fun.com", test.getCurrentPage());
    }

    @Test
    public void example_3(){
        WebBrowser test = new WebBrowser();
        test.openNewPage("youtube.com");
        test.openNewPage("hi.com");
        test.openNewPage("fun.com");
        test.previousPage();
        assertEquals("hi.com", test.getCurrentPage());
        test.previousPage();
        assertEquals("youtube.com", test.getCurrentPage());
        test.previousPage();
        assertEquals("google.com", test.getCurrentPage());

    }

    @Test
    public void example_4(){
        WebBrowser test = new WebBrowser();
        test.openNewPage("youtube.com");
        test.openNewPage("hi.com");
        test.openNewPage("fun.com");
        test.previousPage();
        test.previousPage();
        test.previousPage();
        test.nextPage();
        assertEquals("hi.com", test.getCurrentPage());
        test.nextPage();
        assertEquals("youtube.com", test.getCurrentPage());
        test.nextPage();
        assertEquals("google.com", test.getCurrentPage());
    }

    @Test
    public void example_5(){
        WebBrowser test = new WebBrowser();
        test.newTab();

        assertEquals("google.com", test.getCurrentPage());
        WebBrowser test2 = new WebBrowser();
        test2.newTab();

        assertEquals("google.com", test2.getCurrentPage());
        WebBrowser test3 = new WebBrowser();

        test3.newTab();
        assertEquals("google.com", test3.getCurrentPage());
    }



}

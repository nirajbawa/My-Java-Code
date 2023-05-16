import com.web.*;

public class App extends Home{
    public static void main(String args[]){
        Home h = new  Home();
        h.getHome();
        h.getAbout();
        // h.postAbout();
        // h.postDelete();

        System.out.println();
        App App = new App();
        App.getHome();
        App.getAbout();
        App.postHome();
        // App.postDelete();
        
    }
}

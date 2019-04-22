import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> text = new ArrayList<>();

    Blog(){
    }

    public void add(BlogPost blogPost){
        text.add(blogPost);
    }

    public void remove(int i){
        text.remove(i);
    }

    public void update(int i,BlogPost blogPost){
        text.set(i,blogPost);
    }
    public int size(){
        return text.size();
    }
}
import java.util.*;

public class parent_1 {
    void display()
{
        System.out.println("parent_1 display");
    }
}

public class parent_2 {
    void display()
{
        System.out.println("parent_2 display");
    }
}

public class check extends parent_1{
    public static void main(String[] args) {
        check c = new check();
        c.display();
    }
}

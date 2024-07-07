
import java.util.List;

public class MyUser implements IUser {
    
    @Override
    public int f1(List<User> t) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < t.size(); i++) {
            if (Character.isDigit(t.get(i).getName().charAt(1))) {
                if (max < t.get(i).getStatus()) {
                    max = t.get(i).getStatus();
                }
            }
        }
        return max;
    }
    
    @Override
    public void f2(List<User> t) {
        for (int i = 3; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                User n = t.get(i);
                t.set(i, t.get(j));
                t.set(j, n);
            }
        }
    }
    
    @Override
    public void f3(List<User> t) {
        User max = t.get(0);
        for (User i : t) {
            if (i.getStatus() > max.getStatus()) {
                max = i;
            }
        }
        
        t.get(0).setName(max.getName());
        t.get(0).setStatus(max.getStatus());
    }
    
}

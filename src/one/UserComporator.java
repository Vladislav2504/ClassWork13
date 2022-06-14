package one;

import java.util.Comparator;

public class UserComporator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

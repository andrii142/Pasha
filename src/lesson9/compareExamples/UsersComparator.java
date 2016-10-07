package lesson9.compareExamples;

import java.util.Comparator;

public class UsersComparator implements Comparator<User> {
    // -1 o1 < o2
    // 0 o1 == o2
    // 1 o1 > o2

    @Override
    public int compare(User o1, User o2) {
        //int user1 = o1.getAge();
        //int user2 = o2.getAge();
        //int res = user1 - user2;
        //if(res < 0) return -1;
        //return res;

        return o1.getAge() - o2.getAge();
    }
}

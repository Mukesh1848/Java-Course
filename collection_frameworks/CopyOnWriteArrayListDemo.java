//  copy on write means whenever a perform write operation(like add & remove).
//  instead of modyfing the original/exiting list create a copy of list and modyfing it.
//  This ensures that other threads reading the list while it;s being modified are unaffected.
// fast & direct


package collection_frameworks;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    }
}

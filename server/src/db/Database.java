package db;

import collection.CollectionElement;
import collection.CollectionInfo;

import java.util.List;

public interface Database extends AutoCloseable {
    List<CollectionElement> show(int user_id);
    CollectionInfo info(int user_id);
    void addElement(CollectionElement element, int user_id);
    void removeElement(CollectionElement element, int user_id);
    void removeFirst(int userId);
    void removeLast(int userId);
    void addUser(String email, String userPassword);
    boolean checkUser(String email, String userPassword);
    int getUserId(String email, String userPassword);
    boolean consistsUser(String email);
}

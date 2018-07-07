package blog.services;

public interface NotificationService {

    void addInfoMessage(String msg);
    void addErrorMessage(String msg);
}
//approach to create a note when post created, not exist, etc.
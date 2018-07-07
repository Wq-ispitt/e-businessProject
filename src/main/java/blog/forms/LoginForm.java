package blog.forms;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Size;

public class LoginForm {

    @Size(min = 2, max = 30,
            message = "Please enter username between 2 to 30 characters")
    private String username;

    @Size(min = 6, max = 20, message = "Password between 6 to 20")
    @NotNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

package com.javaproject.caloriesmanager.web.user;

import com.javaproject.caloriesmanager.AuthorizedUser;
import com.javaproject.caloriesmanager.model.User;
import org.springframework.stereotype.Controller;

@Controller
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(AuthorizedUser.id());
    }

    public void delete() {
        super.delete(AuthorizedUser.id());
    }

    public void update(User user) {
        super.update(user, AuthorizedUser.id());
    }
}
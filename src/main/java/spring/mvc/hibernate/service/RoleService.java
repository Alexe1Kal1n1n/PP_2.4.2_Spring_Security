package spring.mvc.hibernate.service;

import spring.mvc.hibernate.model.Role;
import spring.mvc.hibernate.model.User;

import java.util.HashSet;
import java.util.List;

public interface RoleService {

    List<User> getListRole();

    void add(Role role);

    void update(Role role);

    Role getById(int id);

    Role getByName(String roleName);

    public HashSet getRoleSet(String[] role);
}

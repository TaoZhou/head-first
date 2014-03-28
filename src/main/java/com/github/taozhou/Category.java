/**
 * 
 */
package com.github.taozhou;

import java.util.Comparator;

public class Category implements Comparator<Category> {

    private Long id;

    private String name;

    private String email;

    public Category() {

    };

    public Category(final Long id, final String name) {

        this.id = id;
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(final String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(final String email) {

        this.email = email;
    }

    public Long getId() {

        return id;
    }

    public void setId(final Long id) {

        this.id = id;
    }

    public int compare(final Category o1, final Category o2) {

        int flag = o1.getName().compareTo(o2.getName());
        if (flag == 0) {
            flag = (int) (o1.getId() - o2.getId());
        }
        return flag;
    }

}

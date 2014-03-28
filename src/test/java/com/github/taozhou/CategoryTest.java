/**
 * 
 */
package com.github.taozhou;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class CategoryTest {

    @Test
    public void addTwoDifferentCategories() {

        String name = "zhoutao";
        Category category1 = new Category(1l, name);
        Category category2 = new Category(2l, "tttt");
        Set<Category> categories = new HashSet<Category>();
        categories.add(category1);
        categories.add(category2);
        assertEquals(2, categories.size());
    }

}

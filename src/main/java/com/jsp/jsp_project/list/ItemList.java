package com.jsp.jsp_project.list;

import com.jsp.jsp_project.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    public List<Item> listOfItem(){
        return new ArrayList(List.of(new Item(1,"name1"), new Item(2,"name2"), new Item(3,"name3")));
    }


}

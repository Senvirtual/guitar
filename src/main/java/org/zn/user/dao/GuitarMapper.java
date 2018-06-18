package org.zn.user.dao;


import org.zn.user.entity.guitar;
import org.zn.user.entity.guitarSpec;

import java.util.List;

public interface GuitarMapper {
    int deleteByPrimaryKey(Integer id);

    guitar selectByPrimaryKey(Integer id);

    List<guitar> selectAll();


}
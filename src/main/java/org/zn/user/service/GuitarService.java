package org.zn.user.service;

import org.zn.user.entity.guitar;
import org.zn.user.entity.guitarSpec;

import java.util.List;

/**
 * Created by zn on 2017/4/11.
 */
public interface GuitarService {
    public List<guitar> selectAll();
}

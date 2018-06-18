package org.zn.user.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zn.user.dao.GuitarMapper;
import org.zn.user.entity.guitar;
import org.zn.user.service.GuitarService;

import java.util.List;
@Service
public class GuitarServiceImpl implements GuitarService {

    @Autowired
    private GuitarMapper guitarMapper;


    public List<guitar> selectAll() {
        return guitarMapper.selectAll();
    }
}

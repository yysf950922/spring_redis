package com.odin.service.impl;

import com.odin.dao.IndexMapper;
import com.odin.entity.People;
import com.odin.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Odin
 * @Date: 2018/8/1 15:56
 * @Description:
 */
@Service
public class IndexServiceImpl implements IndexService {


    @Autowired
    private IndexMapper indexMapper;

    @Override
    public List<People> getPeople() {
        return indexMapper.getPeople();
    }
}

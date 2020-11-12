package com.bsn.service.impl;

import com.bsn.client.ArtificerClient;
import com.bsn.entity.Artificer;
import com.bsn.service.ArtificerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jiusan
 * @since 2020-11-06
 */
@Service
public class ArtificerServiceImpl implements ArtificerService {
    @Autowired
    private ArtificerClient artificerClient;




    @Override
    public List<Artificer> list() {
        return artificerClient.list();
    }

    @Override
    public Artificer getById(Long id) {
        return artificerClient.getById(id);
    }
}

package org.olga.repository;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.olga.constant.RobberConstants;
import org.olga.entity.Robber;
import org.olga.entity.RobberImpl;

import java.util.ArrayList;
import java.util.List;

public class RobberRepositoryImpl implements RobberRepository {
    private static final List<Robber> ROBBER_LIST = new ArrayList<>(RobberConstants.INITIAL_ROBBER_LIST_SIZE);

    static {
        for (int i = 0; i < RobberConstants.INITIAL_ROBBER_LIST_SIZE; i++) {
            String randomName = RandomStringUtils.randomAlphabetic(10);
            int randomLevel = RandomUtils.nextInt(0, 1000);

            ROBBER_LIST.add(new RobberImpl(randomName, randomLevel));
        }
    }

    @Override
    public List<Robber> getAllRobbers() {
        return ROBBER_LIST;
    }
}

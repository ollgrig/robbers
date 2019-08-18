package org.olga;

import org.apache.commons.lang3.RandomUtils;
import org.olga.constant.RobberConstants;
import org.olga.service.RobberService;
import org.olga.service.RobberServiceImpl;

public class AliBabaInfo {
    private static RobberService robberService= new RobberServiceImpl();

    public static void main(String[] args) {
        robberService.printAllRobbers();
        robberService.printTheBestRobber();
        robberService.printRandomRobbers(RandomUtils.nextInt(0, RobberConstants.INITIAL_ROBBER_LIST_SIZE));
    }

}

package org.olga.service;

import org.apache.commons.lang3.RandomUtils;
import org.olga.entity.Robber;
import org.olga.repository.RobberRepositoryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class RobberServiceImpl implements RobberService {

    private RobberRepositoryImpl robberRepository = new RobberRepositoryImpl();

    @Override
    public void printAllRobbers() {
        System.out.println("All robbers:");
        for (Robber robber : robberRepository.getAllRobbers()) {
            System.out.println(robber);
        }
        System.out.println("**************************************************");
    }

    @Override
    public void printTheBestRobber() {
        System.out.println("The best robber:");
        List<Robber> sortedList = new ArrayList<>(robberRepository.getAllRobbers());
        sortedList.sort((o1, o2) -> o2.getLevel() - o1.getLevel());
        System.out.println(sortedList.get(0));
        System.out.println("**************************************************");
    }

    @Override
    public void printRandomRobbers(int countOfRobbers) {

        System.out.println(countOfRobbers + " random robbers:");
        List<Robber> robbers = robberRepository.getAllRobbers();
        Stream.generate(() -> RandomUtils.nextInt(0, robbers.size()))
                .limit(countOfRobbers)
                .map(robbers::get)
                .forEach(System.out::println);
        System.out.println("**************************************************");
    }
}

package com.lyx.ag.build;

/**
 * Created by liyixiang on 2017/11/28.
 */
public class RunCase {

    public static void main(String[] args) {
        Builder builder = new PersonBuilder();
        Person person = builder.withBody("身体")
                .withHand("手")
                .withLeg("腿")
                .withHead("头")
                .build();
        System.out.println(person.toString());

    }

}

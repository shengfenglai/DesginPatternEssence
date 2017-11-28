package com.lyx.ag.build;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      人体构造器
*/
public class PersonBuilder implements Builder {

    private Person person;

    @Override
    public Builder withHead(String head) {
        person.addHead(head);
        return this;
    }

    @Override
    public Builder withHand(String hand) {
        person.addHand(hand);
        return this;
    }

    @Override
    public Builder withLeg(String leg) {
        person.addLeg(leg);
        return this;
    }

    @Override
    public Builder withBody(String body) {
        person.addBody(body);
        return this;
    }

    @Override
    public void build() {
        PersonBuilder personBuilder = new PersonBuilder();

    }


}

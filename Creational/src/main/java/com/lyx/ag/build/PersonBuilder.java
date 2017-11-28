package com.lyx.ag.build;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      人体构造器
*/
public class PersonBuilder implements Builder {

    private Person person;

    public PersonBuilder(){
        person = new Person();
    }

    public Builder withHead(String head) {
        person.addHead(head);
        return this;
    }

    public Builder withHand(String hand) {
        person.addHand(hand);
        return this;
    }

    public Builder withLeg(String leg) {
        person.addLeg(leg);
        return this;
    }

    public Builder withBody(String body) {
        person.addBody(body);
        return this;
    }

    public Person build() {
        return person;
    }

}

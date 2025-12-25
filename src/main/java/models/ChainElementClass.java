package models;

import Interface.ChainElement;

public class ChainElementClass implements ChainElement {
    private String value;
    private ChainElementClass next;
    private ChainElementClass previous;

    public ChainElementClass(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
    @Override
    public ChainElement getNext() {
        return next;
    }
    @Override
    public ChainElement getPrevious() {
        return previous;
    }
    public void setNext(ChainElementClass next) {
        this.next = next;
    }
    public void setPrevious(ChainElementClass prev) {
        this.previous = prev;
    }
    public void setValue(String value) {
        this.value = value;
    }

}

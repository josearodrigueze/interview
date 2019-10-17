package models;

public class Rule {
    private int id;
    private String operator;
    private int order;
    private Integer comparator;
    private Double factor;

    Rule() {
    }

    Rule(int id, String operator, int order, Integer comparator, Double factor) {
        this.id = id;
        this.operator = operator;
        this.order = order;
        this.comparator = comparator;
        this.factor = factor;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getOperator() {
        return operator;
    }

    void setOperator(String operator) {
        this.operator = operator;
    }

    int getOrder() {
        return order;
    }

    void setOrder(int order) {
        this.order = order;
    }

    Integer getComparator() {
        return comparator;
    }

    void setComparator(Integer comparator) {
        this.comparator = comparator;
    }

    Double getFactor() {
        return factor;
    }

    void setFactor(Double factor) {
        this.factor = factor;
    }
}

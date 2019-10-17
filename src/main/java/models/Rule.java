package models;

public class Rule {
    private String operator;
    private Integer comparator;
    private Integer factor;
    private String type;
    private String scope;

    public Rule(String operator, Integer comparator, Integer factor, String type, String scope) {
        this.operator = operator;
        this.comparator = comparator;
        this.factor = factor;
        this.type = type;
        this.scope = scope;
    }

    public String getOperator() {
        return operator;
    }

    public Integer getComparator() {
        return comparator;
    }

    public Integer getFactor() {
        return factor;
    }

    public String getType() {
        return type;
    }

    public String getScope() {
        return scope;
    }
}

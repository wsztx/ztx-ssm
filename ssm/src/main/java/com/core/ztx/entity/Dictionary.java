package com.core.ztx.entity;

public class Dictionary {
    private Long id;

    private String dicType;

    private String dicText;

    private String dicValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDicType() {
        return dicType;
    }

    public void setDicType(String dicType) {
        this.dicType = dicType == null ? null : dicType.trim();
    }

    public String getDicText() {
        return dicText;
    }

    public void setDicText(String dicText) {
        this.dicText = dicText == null ? null : dicText.trim();
    }

    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue == null ? null : dicValue.trim();
    }
}
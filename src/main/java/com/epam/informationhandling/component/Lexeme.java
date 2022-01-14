package com.epam.informationhandling.component;

public class Lexeme implements Component {

    private String value;
    private LexemeType lexemeType;

    public Lexeme(String value, LexemeType lexemeType) {
        this.value = value;
        this.lexemeType = lexemeType;
    }

    public static Lexeme word(String value) {
        return new Lexeme(value, LexemeType.WORD);
    }

    public static Lexeme expression(String value) {
        return new Lexeme(value, LexemeType.EXPRESSION);
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public Component get(int number) {
        return null;
    }

    @Override
    public void remove(Component component) {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LexemeType getLexemeType() {
        return lexemeType;
    }

    public void setLexemeType(LexemeType lexemeType) {
        this.lexemeType = lexemeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Lexeme lexeme = (Lexeme) o;
        if (value != null ? !value.equals(lexeme.value) : lexeme.value != null) {
            return false;
        }
        return lexemeType == lexeme.lexemeType;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (lexemeType != null ? lexemeType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Lexeme{" +
                "value='" + value + '\'' +
                ", lexemeType=" + lexemeType +
                '}';
    }
}

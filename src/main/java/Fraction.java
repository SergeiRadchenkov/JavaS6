import java.util.Objects;

/*
Класс для работы с дробями
 */
public class Fraction {
    private int numerator; // числитель
    private int denominator; // знаменатель

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Знаменатель не может быть равен нулю");
        }
        this.denominator = denominator;
    }

    public Fraction plus(Fraction f) {
        int den = denominator * f.denominator;
        int num = numerator * f.denominator + f.numerator * denominator;
        return new Fraction(num, den);
    }

    public static Fraction plus(Fraction f1, Fraction f2) {
        int den = f1.denominator * f2.denominator;
        int num = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        return  new Fraction(num, den);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;

        if (denominator == 0) {
            throw new RuntimeException("Знаменатель не может быть равен нулю");
        }

        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }
}

package builder;

public class Pizza {
    private final String size;
    private final String dough;
    private final boolean cheese;
    private final boolean bacon;
    private final boolean mashrooms;
    private final boolean chicken;
    private final boolean sausage;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.dough = builder.dough;
        this.cheese = builder.cheese;
        this.bacon = builder.bacon;
        this.mashrooms = builder.mashrooms;
        this.chicken = builder.chicken;
        this.sausage = builder.sausage;
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isBacon() {
        return bacon;
    }

    public boolean isMashrooms() {
        return mashrooms;
    }

    public boolean isChicken() {
        return chicken;
    }

    public boolean isSausage() {
        return sausage;
    }

    @Override
    public String toString() {
        return String.format("Пицца: " +
                "размер = %s, " +
                "тесто = %s, " +
                "сыр = %b, " +
                "бекон = %b, " +
                "грибы = %b, " +
                "колбаса = %b",
                size, dough, cheese, bacon, mashrooms, chicken, sausage);
    }

    public static class Builder{
        private String size;
        private String dough;
        private boolean cheese;
        private boolean bacon;
        private boolean mashrooms;
        private boolean chicken;
        private boolean sausage;

        public Builder(String size, String dough) {
            this.size = size;
            this.dough = dough;
        }

        public Builder addCheese() {
            this.cheese = true;
            return this;
        }

        public Builder addBacon() {
            this.bacon = true;
            return this;
        }

        public Builder addMushrooms() {
            this.mashrooms = true;
            return this;
        }

        public Builder addChicken() {
            this.chicken = true;
            return this;
        }

        public Builder addSausage() {
            this.sausage = true;
            return this;
        }

        // Главный метод — собирает пиццу
        public Pizza build() {
            return new Pizza(this);
        }
    }
}

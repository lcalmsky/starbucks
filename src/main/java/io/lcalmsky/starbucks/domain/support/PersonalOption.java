package io.lcalmsky.starbucks.domain.support;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public enum PersonalOption {
    ;

    @RequiredArgsConstructor
    @Getter
    public enum Coffee implements Expressible {
        DRIP("드립");

        private final String value;
    }

    @RequiredArgsConstructor
    @Getter
    public enum Syrup implements Expressible {
        DOLCE("돌체"), VANILLA("바닐라"), HAZELNUT("헤이즐넛"), CARAMEL("카라멜");

        private final String value;

        public static int getRecommendedPumpsBySize(Size size) {
            return size.ordinal() + 2;
        }

        public final int getMaxPumps() {
            return 9;
        }

        @Override
        public String toString() {
            return String.format("%s 시럽", getValue());
        }
    }

    @RequiredArgsConstructor
    @Getter
    public enum Base implements Expressible {
        VANILLA_CREAM("바닐라 크림");

        private final String value;

        @Override
        public String toString() {
            return getValue() + " 베이스";
        }
    }

    @RequiredArgsConstructor
    @Getter
    public enum ICE implements Expressible {
        NONE("없이"), LITTLE("적게"), NORMAL("보통"), BIG("많이");

        private final String value;
    }

    @RequiredArgsConstructor
    @Getter
    public enum WhippingCream implements Expressible {
        NORMAL("일반"), ESPRESSO("에스프레소");

        private final String value;

        @Override
        public String toString() {
            return String.format("%s 휘핑", value);
        }
    }

    interface Expressible {
        String getValue();
    }
}